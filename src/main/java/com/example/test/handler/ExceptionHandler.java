package com.example.test.handler;


import com.example.test.vo.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler({
            Exception.class
    })
    @ResponseStatus(HttpStatus.OK)
    public BaseResponse<Object> handleSpringException(HttpServletRequest request, Exception ex) {
        BaseResponse<Object> response = new BaseResponse<>();
        response.setCode(HttpStatus.BAD_REQUEST.value());
        String msg = null;
        if (ex instanceof BindException) {
            BindException bindException = (BindException) ex;
            List<ObjectError> allErrors = bindException.getAllErrors();
            StringBuilder sb = new StringBuilder();
            for (ObjectError error : allErrors) {
                sb.append(error.getDefaultMessage()).append("; ");
            }
            msg = sb.toString();
        }
        String replyMsg = msg != null ? msg : ex.getMessage();
        log.error("处理请求失败: {} ex: {} msg: {}",
                getRequesterInfo(request), ex.getClass().getSimpleName(), replyMsg);
        response.setMessage(replyMsg);
        return response;
    }

    private String getRequesterInfo(HttpServletRequest request) {
        return request.getRequestURI();
    }
}

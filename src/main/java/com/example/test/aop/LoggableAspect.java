package com.example.test.aop;

import com.example.test.annotation.Loggable;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

@Aspect
@Component
@Slf4j
public class LoggableAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("@annotation(com.example.test.annotation.Loggable)")
    public void pointCut(){

    }

    @Around("pointCut()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Loggable loggable = method.getAnnotation(Loggable.class);
        String methodName = StringUtils.isNotEmpty(loggable.value()) ? loggable.value() : method.getName();
        logger.info("Method {} execution started at {}", methodName, LocalDateTime.now());
        Object result = joinPoint.proceed();
        logger.info("Method {} execution ended at {}", methodName, LocalDateTime.now());
        return result;
    }
}

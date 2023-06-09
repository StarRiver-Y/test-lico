package com.example.test.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {
    private int code;

    private T data;

    private String message;

    private String description;

    public BaseResponse(){

    }

    public BaseResponse(int code, T data, String message,String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data,String message) {
        this(code,data,message,"");
    }

    public BaseResponse(int code, T data) {
        this(code,data,"","");
    }

    public BaseResponse(BaseResponseCode errorCode){
        this(errorCode.getCode(),null,errorCode.getMessage(),errorCode.getDescription());
    }

}

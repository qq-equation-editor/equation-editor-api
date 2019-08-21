package com.zylear.equation.editor.bean;

/**
 * Created by xiezongyu on 2019/8/20.
 */
public class BaseResponse {

    public static final BaseResponse SIMPLE_SUCC_RESPONSE = new BaseResponse(0, "success");
    public static final BaseResponse SIMPLE_ERROR_RESPONSE = new BaseResponse(1, "fail");


    private Integer errorCode;
    private String errorMessage;

    public BaseResponse() {
    }

    public BaseResponse(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

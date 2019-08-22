package com.zylear.equation.editor.bean;

/**
 * Created by xiezongyu on 2019/8/22.
 */
public class IsLoginResponse {

    private BaseResponse baseResponse;
    private String userName;

    public BaseResponse getBaseResponse() {
        return baseResponse;
    }

    public void setBaseResponse(BaseResponse baseResponse) {
        this.baseResponse = baseResponse;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

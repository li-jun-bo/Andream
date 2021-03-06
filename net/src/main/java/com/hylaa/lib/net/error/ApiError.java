package com.hylaa.lib.net.error;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Error status code associated with the request.
 *
 * @author William Lee
 * @version v1.0.0
 * @created 2016-11-6.
 * @tel 152-5320-8570
 */
public class ApiError extends RuntimeException implements Serializable{


    @SerializedName("status_code")
    public int code;

    @SerializedName("message")
    public String msg;

    public ApiError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiError(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

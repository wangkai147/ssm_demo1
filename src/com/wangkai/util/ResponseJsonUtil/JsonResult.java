package com.wangkai.util.ResponseJsonUtil;

import java.io.Serializable;

/**
 * Response JsonResult for RESTful <br>
 * 封装 返回Json 统一格式数据
 *
 * @author wangkai
 * @since 2021年3月22日 上午10:51:46
 **/

public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = -4699713095477151086L;
    //code
    private int code;
    //消息
    private String msg;
    //受否成功
    private boolean success;
    //data
    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String message) {
        this.msg = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public JsonResult() {
        super();
    }

    public JsonResult(T data, String msg, boolean success) {
        this.data = data;
        this.msg = msg;
        this.success = success;
    }

    public JsonResult(T data, String msg) {
        this.data = data;
        this.msg = msg;
        this.success = true;
    }

    public JsonResult(T data) {
        this.data = data;
        this.success = true;
    }
}
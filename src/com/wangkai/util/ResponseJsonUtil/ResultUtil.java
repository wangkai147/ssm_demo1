package com.wangkai.util.ResponseJsonUtil;

public class ResultUtil<T> {
    //定义统一状态码

    //定义统一消息


    public static JsonResult<Object> success(Object object) {
        JsonResult<Object> result = new JsonResult<Object>();
        result.setCode(2000);
        result.setMsg("success");
        return result;
    }


    public static JsonResult<Object> error(Integer code, String msg, Object object) {
        JsonResult<Object> result = new JsonResult<Object>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
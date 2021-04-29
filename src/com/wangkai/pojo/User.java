package com.wangkai.pojo;

import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * mybatis数据库中user表的持久化类
 *  * 这样的对象的特点:
 *  * 1实现Serializable,并提供版本ID
 *  * 2提供无参构造函数
 *  * 3提供属性以及对应的get/set方法,属性名要与表中的字段名保持一致
 *  * 4有选择性地重写toString方法
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

    private String code;
    private String msg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

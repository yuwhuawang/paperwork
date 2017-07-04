package com.paperwork.commons;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by yuwhuawang on 2017/7/4.
 */
public class ApiResult<T> {
    public static final ApiResult SUCCESS = new ApiResult();     //调用成功

    private int resCode;

    private String msg;

    private T obj;

    private String error;

    private void init(int resCode, String msg, T obj) {
        this.resCode = resCode;
        this.msg = msg;
        this.obj = obj;
    }

    public ApiResult() {
        init(0, null, null);
    }

    public ApiResult(int resCode, String msg, T obj) {
        init(resCode, msg, obj);
    }

    public ApiResult(int resCode) {
        init(resCode, null, null);
    }

    public ApiResult(int resCode, String msg) {
        init(resCode, msg, null);
    }

    public ApiResult(String msg) {
        init(0, msg, null);
    }

    public ApiResult(String msg, T obj) {
        init(0, msg, obj);
    }

    public ApiResult(T obj) {
        init(0, null, obj);
    }

    public ApiResult(int resCode, String msg, T obj, Throwable e) {
        init(resCode, msg, obj);
        setError(getStackTrace(e));
    }

    private String getStackTrace(Throwable e) {
        if (e == null) return null;

        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        e.printStackTrace(new PrintStream(buf));
        return buf.toString();
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

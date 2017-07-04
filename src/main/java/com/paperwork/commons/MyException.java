package com.paperwork.commons;

/**
 * Created by yuwhuawang on 2017/7/4.
 */
public class MyException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private int code = 999;

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(int code, String message) {
        super(message);
        this.code = code;
    }

    public MyException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public int getCode() {
        return code;
    }
}

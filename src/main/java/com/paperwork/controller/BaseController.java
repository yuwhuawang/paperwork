package com.paperwork.controller;

import com.paperwork.commons.ApiResult;
import com.paperwork.commons.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yuwhuawang on 2017/7/4.
 */
public abstract class BaseController {
    public BaseController() {
    }

    @ExceptionHandler({Throwable.class})
    @ResponseBody
    public Object handlerException(Exception e, HttpServletRequest request) throws Throwable {
        this.error(e.getMessage(), (Throwable)e);
        ApiResult errRes = null;
        if(e instanceof MyException) {
            MyException myEx = (MyException)e;
            errRes = new ApiResult(myEx.getCode(), myEx.getMessage(), (Object)null, myEx);
        } else {
            errRes = new ApiResult(9999, e.getMessage(), (Object)null, e);
        }

        return errRes;
    }

    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

    protected void info(String msg) {
        this.getLogger().info(msg);
    }

    protected void info(String format, Object... args) {
        this.getLogger().info(String.format(format, args));
    }

    protected void debug(String msg) {
        this.getLogger().debug(msg);
    }

    protected void debug(String format, Object... args) {
        this.getLogger().debug(String.format(format, args));
    }

    protected void error(String msg) {
        this.getLogger().error(msg);
    }

    protected void error(String format, Object... args) {
        this.getLogger().error(String.format(format, args));
    }

    protected void error(String msg, Throwable t) {
        this.getLogger().error(msg, t);
    }

    protected void errorAndThrow(String msg) {
        this.error(msg);
        throw new MyException(1, msg);
    }

    protected void errorAndThrow(String format, Object... args) {
        String errMsg = String.format(format, args);
        this.errorAndThrow(errMsg);
    }

}

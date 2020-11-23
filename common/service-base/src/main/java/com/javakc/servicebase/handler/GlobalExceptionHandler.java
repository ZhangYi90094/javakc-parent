package com.javakc.servicebase.handler;

import com.javakc.commonutils.api.APICODE;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dell
 * @data 2020-11-23 19:39
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public APICODE errorHandle(Exception e){
        e.printStackTrace();
        return APICODE.ERROR().message("Exception:服务器异常");
    }

    public APICODE errorHAndler(HctfException e){
        e.printStackTrace();
        return APICODE.ERROR().message(e.getMessage()).code(e.getCode());
    }

}

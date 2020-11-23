package com.javakc.commonutils.api;

/**
 * 公共错误码
 * @author dell
 * @data 2020-11-23 18:53
 */
public interface ResultCode {

    /**
     * 调用成功
     */
    public static Integer SUCCESS = 20000;

    /**
     * 服务不可用调用失败
     */
    public static Integer ERROR = 20001;
}

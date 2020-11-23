package com.javakc.servicebase.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dell
 * @data 2020-11-23 19:31
 */
@Data
@AllArgsConstructor // ##使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor // ##使用后创建一个无参构造函数
public class HctfException extends RuntimeException {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

}

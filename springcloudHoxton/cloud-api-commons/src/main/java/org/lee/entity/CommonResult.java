package org.lee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 前后端分离返回结果 比如：404 not_found

    private Integer code;
    private String message;
    private T data;

    // 只有两个参数的情况，this调用父类构造
    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}

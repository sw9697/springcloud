package com.sqq.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 19:16 09 26 2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message) {
       this(code,message,null);
    }
}

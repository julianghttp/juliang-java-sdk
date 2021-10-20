package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 动态代理--剩余IP可用数量
 */
@Data
@Accessors(chain = true)
public class DynamicBalance {

    /**
     * key 业务秘钥
     */
    @NotBlank(message = "秘钥不能为空")
    private String key;
    /**
     * 业务号
     */
    @NotBlank(message = "业务编号必传")
    private String tradeNO;


}

package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 动态代理--检查代理IP可用性
 */
@Data
@Accessors(chain = true)
public class DynamicCheck {



    /**
     * key 业务秘钥
     */
    @NotBlank(message = "秘钥不能为空")
    private String key;
    /**
     * 业务号
     */
    @NotBlank(message = "业务编号必传")
    private String trade_no;
    /**
     * 代理列表
     */
    @NotBlank(message = "代理列表不能为空")
    private String proxy;


}

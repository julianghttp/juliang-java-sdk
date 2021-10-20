package com.juliang.common;


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
    private String key;
    /**
     * 业务号
     */
    private String trade_no;


}

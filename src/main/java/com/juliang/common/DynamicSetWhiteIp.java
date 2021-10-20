package com.juliang.common;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 动态代理--设置IP白名单
 */
@Data
@Accessors(chain = true)
public class DynamicSetWhiteIp {

    /**
     * key 业务秘钥
     */
    private String key;
    /**
     * 业务编号
     */
    private String trade_no;
    /**
     * IP列表
     */
    private String ips;

}

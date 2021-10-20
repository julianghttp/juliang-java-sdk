package com.juliang.common;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 动态代理--获取IP白名单
 */
@Data
@Accessors(chain = true)
public class DynamicGetWhiteIp {

    /**
     * key 业务秘钥
     */
    private String key;
    /**
     * 业务编号
     */
    private String trade_no;

}

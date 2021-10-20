package com.juliang.common;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 独享代理 -- 设置IP白名单
 */
@Data
@Accessors(chain = true)
public class AloneSetWhiteIp {

    /**
     * key 业务秘钥
     */
    private String key;
    /**
     * 业务号
     */
    private String trade_no;
    /**
     * IP列表
     */
    private String ips;
}

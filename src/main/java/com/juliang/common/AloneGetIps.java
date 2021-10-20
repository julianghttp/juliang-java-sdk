package com.juliang.common;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 独享dialing---获取代理IP
 */
@Data
@Accessors(chain = true)
public class AloneGetIps {

    /**
     * key 业务秘钥
     */
    private String key;
    /**
     * 业务号
     */
    private String trade_no;
    /**
     * 代理端口
     */
    private Integer sock_port;
    /**
     * 地区名称
     */
    private Integer city_name;
    /**
     * 邮政编码
     */
    private Integer city_code;
    /**
     * 业务到期时间
     */
    private String order_endtime;


}

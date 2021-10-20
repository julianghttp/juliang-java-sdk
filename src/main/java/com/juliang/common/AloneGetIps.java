package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

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
    @NotBlank(message = "秘钥不能为空")
    private String key;
    /**
     * 业务号
     */
    @NotBlank(message = "业务编号必传")
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

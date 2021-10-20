package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

/**
 * 独享代理 -- 设置IP白名单
 */
public class AloneSetWhiteIp {

    /**
     * 业务号
     */
    @NotBlank(message = "业务编号必传")
    private String trade_no;
    /**
     * IP列表列表
     */
    private String ips;

    /**
     * 获取业务编号
     * @return  业务编号
     */
    public String getTradeNo() {
        return trade_no;
    }

    /**
     * 设置业务编号
     * @param trade_no 业务编号
     * @return
     */
    public AloneSetWhiteIp setTradeNo(String trade_no) {
        this.trade_no = trade_no;
        return this;
    }

    /**
     * 获取IP列表
     * @return IP列表
     */
    public String getIps() {
        return ips;
    }

    /**
     * 设置IP列表
     * @param ips IP列表
     * @return
     */
    public AloneSetWhiteIp setIps(String ips) {
        this.ips = ips;
        return this;
    }

    public AloneSetWhiteIp() {


    }
}

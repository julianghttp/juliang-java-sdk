package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

/**
 * 动态代理--设置IP白名单
 */
public class DynamicSetWhiteIp {

    /**
     * 业务编号
     */
    @NotBlank(message = "业务编号必传")
    private String trade_no;
    /**
     * IP列表
     */
    private String ips;

    /**
     * 获取业务编号
     * @return 业务编号
     */
    public String getTradeNO() {
        return trade_no;
    }

    /**
     * 设置业务编号
     * @param tradeNO 业务编号
     * @return
     */
    public DynamicSetWhiteIp setTradeNO(String tradeNO) {
        this.trade_no = tradeNO;
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
    public DynamicSetWhiteIp setIps(String ips) {
        this.ips = ips;
        return this;
    }

    public DynamicSetWhiteIp() {

    }
}

package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

/**
 * 动态代理--获取代理剩余可用时长
 */
public class DynamicRemain {

    /**
     * 业务编号
     */
    @NotBlank(message = "业务编号必传")
    private String trade_no;
    /**
     * 代理列表
     */
    private String proxy;

    /**
     * 设置业务编号
     * @return 获取业务编号
     */
    public String getTradeNo() {
        return trade_no;
    }

    /**
     * 设置业务编号
     * @param tradeNo 业务编号
     * @return
     */
    public DynamicRemain setTradeNo(String tradeNo) {
        this.trade_no = tradeNo;
        return this;
    }

    /**
     * 获取代理列表
     * @return 代理列表
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * 设置代理列表
     * @param proxy 代理列表
     * @return
     */
    public DynamicRemain setProxy(String proxy) {
        this.proxy = proxy;
        return this;
    }

    public DynamicRemain() {

    }
}

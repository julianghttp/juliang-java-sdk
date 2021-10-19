package com.juliang.common;

/**
 * 动态代理--检查代理IP可用性
 */
public class DynamicCheck {

    /**
     * 业务号
     */
    private String trade_no;
    /**
     * 代理列表
     */
    private String proxy;

    /**
     * 获取业务号
     * @return 业务号
     */
    public String getTradeNo() {
        return trade_no;
    }

    /**
     * 设置业务号
     * @param tradeNo  业务号
     * @return
     */
    public DynamicCheck setTradeNo(String tradeNo) {
        this.trade_no = tradeNo;
        return this;
    }

    /**
     * 获取代理列表
     * @return  代理列表
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * 设置代理列表
     * @param proxy 代理列表
     * @return
     */
    public DynamicCheck setProxy(String proxy) {
        this.proxy = proxy;
        return this;

    }

    public DynamicCheck() {

    }
}

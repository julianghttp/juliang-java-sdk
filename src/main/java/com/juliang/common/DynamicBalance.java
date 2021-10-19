package com.juliang.common;

/**
 * 动态代理--剩余IP可用数量
 */
public class DynamicBalance {

    /**
     * 业务号
     */
    private String tradeNO;

    /**
     * 获取业务号
     * @return 业务号
     */
    public String getTradeNO() {
        return tradeNO;
    }

    /**
     * 设置业务号
     * @param tradeNO   业务号
     * @return
     */
    public DynamicBalance setTradeNO(String tradeNO) {
        this.tradeNO = tradeNO;
        return this;
    }

    public DynamicBalance() {

    }
}

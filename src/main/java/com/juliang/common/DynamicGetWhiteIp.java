package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

/**
 * 动态代理--获取IP白名单
 */
public class DynamicGetWhiteIp {

    /**
     * 业务编号
     */
    @NotBlank(message = "业务编号必传")
    private String trade_no;

    /**
     * 设置业务编号
     * @return  业务编号
     */
    public String getTradeNo() {
        return trade_no;
    }

    public DynamicGetWhiteIp setTradeNo(String tradeNo) {
        this.trade_no = tradeNo;
        return this;
    }

    public DynamicGetWhiteIp() {

    }
}

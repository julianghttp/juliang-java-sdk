package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

public class AloneGetWhiteIp {
    /**
     * 业务号
     */
    @NotBlank(message = "业务编号必传")
    private String trade_no;

    /**
     * 获取业务编号
     * @return 业务编号
     */
    public String getTradeNo() {
        return trade_no;
    }

    /**
     * 设置业务编号
     * @param trade_no  业务编号
     * @return
     */
    public AloneGetWhiteIp setTradeNo(String trade_no) {
        this.trade_no = trade_no;
        return this;
    }

    public AloneGetWhiteIp() {

    }
}

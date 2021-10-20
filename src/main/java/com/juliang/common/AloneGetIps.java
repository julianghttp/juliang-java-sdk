package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

/**
 * 独享dialing---获取代理IP
 */
public class AloneGetIps {

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

    /**
     * @return 业务编号
     */
    public String getTradeNo() {
        return trade_no;
    }

    /**
     * 设置业务编号
     *
     * @param tradeNo 业务编号
     * @return
     */
    public AloneGetIps setTradeNo(String tradeNo) {
        this.trade_no = tradeNo;
        return this;
    }

    /**
     * 获取socker代理端口
     *
     * @return socker代理端口
     */
    public Integer getSockPort() {
        return sock_port;
    }

    /**
     * 设置socker代理端口
     *
     * @param sockPort socker代理端口
     * @return
     */
    public AloneGetIps setSockPort(Integer sockPort) {
        this.sock_port = sockPort;
        return this;
    }

    /**
     * 获取 地区名称
     *
     * @return 地区名称
     */
    public Integer getCityName() {
        return city_name;
    }

    /**
     * 设置地区名称
     *
     * @param cityName 地区名称
     * @return
     */
    public AloneGetIps setCityName(Integer cityName) {
        this.city_name = cityName;
        return this;
    }

    /**
     * 获取邮政编码
     *
     * @return 邮政编码
     */
    public Integer getCityCode() {
        return city_code;
    }

    /**
     * 设置邮政编码
     *
     * @param cityCode 邮政编码
     * @return
     */
    public AloneGetIps setCityCode(Integer cityCode) {
        this.city_code = cityCode;
        return this;
    }

    /**
     * 获取业务到期时间
     *
     * @return 业务到期时间
     */
    public String getOrderEndTime() {
        return order_endtime;
    }

    /**
     * 设置业务到期时间
     *
     * @param orderEndTime 业务到期时间
     * @return
     */
    public AloneGetIps setOrderEndTime(String orderEndTime) {
        this.order_endtime = orderEndTime;
        return this;
    }

    public AloneGetIps() {

    }
}

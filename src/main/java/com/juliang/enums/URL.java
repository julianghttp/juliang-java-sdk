package com.juliang.enums;

/**
 *
 * @author symbol
 * @date 2021年10月19日 16:05
 */
public enum URL {

    /**
     * 1)获取账户余额
     *
     * 2)提取动态代理
     * 2.1)动态代理--提取动态代理IP
     * 2.2)动态代理--检查代理IP的有效性
     * 2.3)动态代理--获取代理剩余可用时长
     * 2.4)动态代理--获取剩余可提取IP数量
     *
     * 3)独享代理
     * 3.1)独享代理--获取代理信息详情
     * 3.2)独享代理--设置IP白名单
     * 3.3)独享代理--获取IP白名单
     *
     */
    USERS_GETBALANCE("/users/getbalance"),
    USERS_GETALLORDERS("/users/getAllOrders"),
    DYNAMIC_GETIPS("/dynamic/getips"),
    DYNAMIC_CHECK("/dynamic/check"),
    DYNAMIC_SETWHITEIP("/dynamic/setwhiteip"),
    DYNAMIC_GETWHITEIP("/dynamic/getwhiteip"),
    DYNAMIC_REPLACEWHITEIP("/dynamic/replaceWhiteIp"),
    DYNAMIC_REMAIN("/dynamic/remain"),
    DYNAMIC_BALANCE("/dynamic/balance"),
    ALONE_GETIPS("/alone/getips"),
    ALONE_SETWHITEIP("/alone/setwhiteip"),
    ALONE_GETWHITEIP("/alone/getwhiteip"),
    ALONE_REPLACEWHITEIP("/alone/replaceWhiteIp");


//    private static final String DOMAIN = "http://127.0.0.1:8087";
    private static final String DOMAIN = "https://v1.api.juliangip.com";

    private String value;

    private URL(String value) {
        this.value = value;
    }

    public String getValue() {
        return DOMAIN + value;
    }

    @Override
    public String toString() {
        return value;
    }
}

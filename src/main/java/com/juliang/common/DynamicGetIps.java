package com.juliang.common;

/**
 * 动态代理--提取代理IP
 */
public class DynamicGetIps {

    /**
     * 业务编号
     */
    private String trade_no;
    /**
     * 提取数量
     */
    private Integer num;
    /**
     * 代理类型
     */
    private Integer pt;
    /**
     * 返回类型
     */
    private String result_type;
    /**
     * 结果分隔符
     */
    private Integer split;
    /**
     * 地区名称
     */
    private Integer city_name;
    /**
     * 邮政编码
     */
    private Integer city_code;
    /**
     * 剩余可用时长
     */
    private Integer ip_remain;
    /**
     * 筛选地区
     */
    private String area;
    /**
     * 排除地区
     */
    private String no_area;
    /**
     * 筛选ip段
     */
    private String ip_seg;
    /**
     * 排除IP段
     */
    private String no_ip_seg;
    /**
     * 运营商筛选
     */
    private String isp;
    /**
     * IP去重
     */
    private Integer filter;

    /**
     * 获取业务编号
     * @return  业务编号
     */
    public String getTradeNo() {
        return trade_no;
    }

    /**
     * 设置业务编号
     * @param tradeNo   业务编号
     * @return
     */
    public DynamicGetIps setTradeNo(String tradeNo) {
        this.trade_no = tradeNo;
        return this;
    }

    /**
     * 获取提取IP数量
     * @return 提取IP数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置提取IP数量
     * @param num 提取IP数量
     * @return
     */
    public DynamicGetIps setNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 获取代理类型
     * @return 代理类型
     */
    public Integer getPt() {
        return pt;
    }

    /**
     * 设置代理类型
     * @param pt 代理类型
     * @return
     */
    public DynamicGetIps setPt(Integer pt) {
        this.pt = pt;
        return this;
    }

    /**
     * 获取返回类型
     * @return  返回类型
     */
    public String getResultType() {
        return result_type;
    }

    /**
     * 设置返回类型
     * @param resultType 返回类型
     * @return
     */
    public DynamicGetIps setResultType(String resultType) {
        this.result_type = resultType;
        return this;
    }

    /**
     * 获取结果分隔符
     * @return 结果分隔符
     */
    public Integer getSplit() {
        return split;
    }

    /**
     * 设置结果分隔符
     * @param split 结果分隔符
     * @return
     */
    public DynamicGetIps setSplit(Integer split) {
        this.split = split;
        return this;
    }

    /**
     * 获取地区名称
     * @return 地区名称
     */
    public Integer getCityName() {
        return city_name;
    }

    /**
     * 设置地区名称
     * @param cityName 地区名称
     * @return
     */
    public DynamicGetIps setCityName(Integer cityName) {
        this.city_name = cityName;
        return this;
    }

    /**
     * 获取邮政编码
     * @return 邮政编码
     */
    public Integer getCityCode() {
        return city_code;
    }

    /**
     * 设置邮政编码
     * @param cityCode 邮政编码
     * @return
     */
    public DynamicGetIps setCityCode(Integer cityCode) {
        this.city_code = cityCode;
        return this;
    }

    /**
     * 获取剩余可用时长
     * @return  剩余可用时长
     */
    public Integer getIpRemain() {
        return ip_remain;
    }

    /**
     * 设置剩余可用时长
     * @param ipRemain 剩余可用时长
     * @return
     */
    public DynamicGetIps setIpRemain(Integer ipRemain) {
        this.ip_remain = ipRemain;
        return this;
    }

    /**
     * 获取筛选地区
     * @return 筛选地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置筛选地区
     * @param area 筛选地区
     * @return
     */
    public DynamicGetIps setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 获取排除地区
     * @return 排除地区
     */
    public String getNoArea() {
        return no_area;
    }

    /**
     * 设置排除地区
     * @param noArea 排除地区
     * @return
     */
    public DynamicGetIps setNoArea(String noArea) {
        this.no_area = noArea;
        return this;
    }

    /**
     * 获取筛选IP端
     * @return 筛选IP端
     */
    public String getIpSeg() {
        return ip_seg;
    }

    /**
     * 设置筛选IP端
     * @param ipSeg 筛选IP端
     * @return
     */
    public DynamicGetIps setIpSeg(String ipSeg) {
        this.ip_seg = ipSeg;
        return this;
    }

    /**
     * 获取排除IP段
     * @return 排除IP段
     */
    public String getNoIpSeg() {
        return no_ip_seg;
    }

    /**
     * 设置排除IP段
     * @param noIpSeg 排除IP段
     * @return
     */
    public DynamicGetIps setNoIpSeg(String noIpSeg) {
        this.no_ip_seg = noIpSeg;
        return this;
    }

    /**
     * 获取筛选运营商
     * @return 筛选运营商
     */
    public String getIsp() {
        return isp;
    }

    /**
     * 设置筛选运营商
     * @param isp 筛选运营商
     * @return
     */
    public DynamicGetIps setIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 获取IP去重状态值
     * @return IP去重状
     */
    public Integer getFilter() {
        return filter;
    }

    /**
     * 设置IP去重状态
     * @param filter IP去重状
     * @return
     */
    public DynamicGetIps setFilter(Integer filter) {
        this.filter = filter;
        return this;
    }


    public DynamicGetIps() {

    }
}

package com.juliang;

import cn.hutool.http.HttpUtil;
import com.juliang.common.*;
import com.juliang.enums.URL;
import com.juliang.ext.StrKit;

import java.util.Map;

public class JuLiang {


    /**
     * 获取账户余额
     *
     * @param usersGetBalance 获取账户余额请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String usersGetBalance( UsersGetBalance usersGetBalance) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(usersGetBalance, usersGetBalance.getKey());
        return HttpUtil.post(URL.USERS_GETBALANCE.getValue(), params);
    }

    /**
     * 获取账户下对应类型的所有正常状态订单号
     * @param usersGetAllOrders 请求参数构建对象
     * @return
     * @throws IllegalAccessException
     */
    public static String getAllOrders(UsersGetAllOrders usersGetAllOrders)throws IllegalAccessException{
        Map<String,Object> params = StrKit.getParams(usersGetAllOrders,usersGetAllOrders.getKey());
        return HttpUtil.post(URL.USERS_GETALLORDERS.getValue(), params);
    }

    /**
     * 获取对应省份下的可用代理城市
     * @param usersGetCity
     * @return
     * @throws IllegalAccessException
     */
    public static String getCity(UsersGetCity usersGetCity) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(usersGetCity, usersGetCity.getKey());
        return HttpUtil.post(URL.USERS_GETCITY.getValue(),params);
    }

    /**
     * 提取动态代理
     * <br/> 不需要的参数不传即可
     *
     * @param dynamicGetIps 动态代理参数
     * @return
     * @throws IllegalAccessException
     */
    public static String dynamicGetIps(DynamicGetIps dynamicGetIps) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicGetIps, dynamicGetIps.getKey());
        return HttpUtil.post(URL.DYNAMIC_GETIPS.getValue(), params);
    }

    /**
     * 动态代理 -- 校验IP可用性
     *
     * @param dynamicCheck 校验IP请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String dynamicCheck(DynamicCheck dynamicCheck) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicCheck, dynamicCheck.getKey());
        return HttpUtil.post(URL.DYNAMIC_CHECK.getValue(), params);
    }

    /**
     * 动态代理 -- 设置代理IP白名单
     *
     * @param dynamicSetWhiteIp 白名单设置请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String dynamicSetWhiteIp( DynamicSetWhiteIp dynamicSetWhiteIp) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicSetWhiteIp, dynamicSetWhiteIp.getKey());
        return HttpUtil.post(URL.DYNAMIC_SETWHITEIP.getValue(), params);
    }

    /**
     * 动态代理 -- 获取IP白名单
     *
     * @param dynamicGetWhiteIp 白名单获取请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String dynamicGetWhiteIp( DynamicGetWhiteIp dynamicGetWhiteIp) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicGetWhiteIp, dynamicGetWhiteIp.getKey());
        return HttpUtil.post(URL.DYNAMIC_GETWHITEIP.getValue(), params);
    }

    /**
     * 动态代理 -- 替换IP白名单
     * @param dynamicReplaceWhiteIp 白名单替换请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String dynamicReplaceWhiteIp(DynamicReplaceWhiteIp dynamicReplaceWhiteIp) throws IllegalAccessException {
        Map<String,Object> params = StrKit.getParams(dynamicReplaceWhiteIp,dynamicReplaceWhiteIp.getKey());
        return HttpUtil.post(URL.DYNAMIC_REPLACEWHITEIP.getValue(), params);
    }

    /**
     * 动态代理 -- 获取代理剩余可用时长
     *
     * @param dynamicRemain 获取代理剩余可用时长请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String dynamicRemain( DynamicRemain dynamicRemain) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicRemain, dynamicRemain.getKey());
        return HttpUtil.post(URL.DYNAMIC_REMAIN.getValue(), params);
    }

    /**
     * 动态代理 -- 获取剩余可用时长
     *
     * @param dynamicBalance 获取剩余可用时长请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String dynamicBalance( DynamicBalance dynamicBalance) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicBalance, dynamicBalance.getKey());
        return HttpUtil.post(URL.DYNAMIC_BALANCE.getValue(), params);
    }

    /**
     * 独享代理 -- 获取代理详情
     *
     * @param aloneGetIps 获取代理详情的请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String aloneGetIps( AloneGetIps aloneGetIps) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(aloneGetIps, aloneGetIps.getKey());
        return HttpUtil.post(URL.ALONE_GETIPS.getValue(), params);
    }

    /**
     * 独享代理 -- 设置代理IP白名单
     *
     * @param aloneSetWhiteIp 设置代理IP白名单请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String aloneSetWhiteIp( AloneSetWhiteIp aloneSetWhiteIp) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(aloneSetWhiteIp, aloneSetWhiteIp.getKey());
        return HttpUtil.post(URL.ALONE_SETWHITEIP.getValue(), params);
    }


    /**
     * 独享代理 -- 获取代理IP白名单
     *
     * @param aloneGetWhiteIp 获取代理IP白名单请求对象
     * @return
     * @throws IllegalAccessException
     */
    public static String aloneGetWhiteIp( AloneGetWhiteIp aloneGetWhiteIp) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(aloneGetWhiteIp, aloneGetWhiteIp.getKey());
        return HttpUtil.post(URL.ALONE_GETWHITEIP.getValue(), params);
    }

    /**
     * 独享代理 -- 替换IP白名单
     * @param aloneReplaceWhiteIp
     * @return
     * @throws IllegalAccessException
     */
    public static String aloneReplaceWhiteIp(AloneReplaceWhiteIp aloneReplaceWhiteIp) throws IllegalAccessException {
        Map<String,Object> params = StrKit.getParams(aloneReplaceWhiteIp,aloneReplaceWhiteIp.getKey());
        return HttpUtil.post(URL.ALONE_REPLACEWHITEIP.getValue(), params);
    }



}

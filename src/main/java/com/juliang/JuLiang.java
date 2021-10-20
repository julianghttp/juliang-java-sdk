package com.juliang;

import cn.hutool.http.HttpUtil;
import com.juliang.common.*;
import com.juliang.enums.URL;
import com.juliang.ext.StrKit;

import java.util.Map;

public class JuLiang {


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


}

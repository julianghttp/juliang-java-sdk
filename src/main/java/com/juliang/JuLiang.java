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
    public static String dynamicGetIps(DynamicGetIps dynamicGetIps, String appkey) throws IllegalAccessException {

        Map<String, Object> params = StrKit.getParams(dynamicGetIps, appkey);
        return HttpUtil.post(URL.DYNAMIC_GETIPS.getValue(), params);
    }

    /**
     * 动态代理 -- 校验IP可用性
     * @param dynamicCheck  校验IP请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String dynamicCheck(DynamicCheck dynamicCheck,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicCheck, appkey);
        return HttpUtil.post(URL.DYNAMIC_CHECK.getValue(),params);
    }

    /**
     * 动态代理 -- 设置代理IP白名单
     * @param dynamicSetWhiteIp  白名单设置请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String dynamicSetWhiteIp(DynamicSetWhiteIp dynamicSetWhiteIp,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicSetWhiteIp, appkey);
        return HttpUtil.post(URL.DYNAMIC_SETWHITEIP.getValue(),params);
    }

    /**
     * 动态代理 -- 获取IP白名单
     * @param dynamicGetWhiteIp 白名单获取请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String dynamicGetWhiteIp(DynamicGetWhiteIp dynamicGetWhiteIp,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicGetWhiteIp,appkey);
        return HttpUtil.post(URL.DYNAMIC_GETWHITEIP.getValue(), params);
    }

    /**
     * 动态代理 -- 获取代理剩余可用时长
     * @param dynamicRemain 获取代理剩余可用时长请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String dynamicRemain(DynamicRemain dynamicRemain,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicRemain, appkey);
        return HttpUtil.post(URL.DYNAMIC_REMAIN.getValue(), params);
    }

    /**
     * 动态代理 -- 获取剩余可用时长
     * @param dynamicBalance 获取剩余可用时长请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String dynamicBalance(DynamicBalance dynamicBalance,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicBalance, appkey);
        return HttpUtil.post(URL.DYNAMIC_BALANCE.getValue(), params);
    }

    /**
     * 获取账户余额
     * @param usersGetBalance 获取账户余额请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String usersGetBalance(UsersGetBalance usersGetBalance,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(usersGetBalance, appkey);
        return HttpUtil.post(URL.USERS_GETBALANCE.getValue(), params);
    }

    /**
     * 独享代理 -- 获取代理详情
     * @param aloneGetIps 获取代理详情的请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String aloneGetIps(AloneGetIps aloneGetIps,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(aloneGetIps, appkey);
        return HttpUtil.post(URL.ALONE_GETIPS.getValue(), params);
    }

    /**
     * 独享代理 -- 设置代理IP白名单
     * @param aloneSetWhiteIp 设置代理IP白名单请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String aloneSetWhiteIp(AloneSetWhiteIp aloneSetWhiteIp,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(aloneSetWhiteIp, appkey);
        return HttpUtil.post(URL.ALONE_SETWHITEIP.getValue(), params);
    }


    /**
     * 独享代理 -- 获取代理IP白名单
     * @param aloneGetWhiteIp 获取代理IP白名单请求对象
     * @return
     * @throws IllegalAccessException
     */
    public String aloneGetWhiteIp(AloneGetWhiteIp aloneGetWhiteIp,String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(aloneGetWhiteIp, appkey);
        return HttpUtil.post(URL.ALONE_GETIPS.getValue(), params);
    }

    /**
     * 校验Auth对象是否实例化
     * @return
     */




}

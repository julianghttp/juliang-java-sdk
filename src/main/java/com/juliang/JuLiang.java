package com.juliang;

import cn.hutool.http.HttpUtil;
import com.juliang.common.DynamicGetIps;
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
    public static String dynamicGetIps(DynamicGetIps dynamicGetIps,@NOTNULL String appkey) throws IllegalAccessException {
        Map<String, Object> params = StrKit.getParams(dynamicGetIps, appkey);
        return HttpUtil.post(URL.DYNAMIC_GETIPS.getValue(), params);
    }


}

package com.juliang;

import cn.hutool.http.HttpUtil;
import com.juliang.common.Auth;
import com.juliang.common.DynamicGetIps;
import com.juliang.enums.URL;
import com.juliang.ext.StrKit;

import java.util.Map;

public class JuLiang {

    private Auth auth;

    public JuLiang(Auth auth) {
        this.auth = auth;
    }

    /**
     * 提取动态代理
     * <br/> 不需要的参数不传即可
     *
     * @param dynamicGetIps 动态代理参数
     * @return
     * @throws IllegalAccessException
     */
    public String dynamicGetIps(DynamicGetIps dynamicGetIps) throws IllegalAccessException {
        if (auth == null) {
            return "请先实例化Auth对象";
        }
        dynamicGetIps.setTradeNo(auth.getAppId());
        Map<String, Object> params = StrKit.getParams(dynamicGetIps, auth);
        return HttpUtil.post(URL.DYNAMIC_GETIPS.getValue(), params);
    }


}

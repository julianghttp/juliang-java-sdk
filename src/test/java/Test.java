import com.juliang.JuLiang;
import com.juliang.common.*;

import java.util.Map;

public class Test {

    private  String userId = "your User ID";
    private  String AccessKey = "User AccessKey";

    private  String dynamicKey = "dynamicKey";
    private  String dynamicTradeNo = "dynamicTradeNo";

    private  String aloneTradeNo = "aloneTradeNo";
    private  String aloneKey = "aloneKey";


    /**
     * 测试获取账户余额API
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public void userBalance() throws IllegalAccessException {
        String money = JuLiang.usersGetBalance(new UsersGetBalance().setUser_id(userId).setKey(AccessKey));
        System.out.println(money);
    }

    /**
     * 动态代理 -- 提取代理iP
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public void dyGetIps() throws IllegalAccessException {
        String a = JuLiang.dynamicGetIps(new DynamicGetIps().setTrade_no(dynamicTradeNo).setNum(10).setKey(dynamicKey));

        System.out.println(a);
    }

    /**
     * 动态代理 -- 检查代理的有效性
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public void Check() throws IllegalAccessException {
        String resp = JuLiang.dynamicCheck(new DynamicCheck().setTrade_no(dynamicTradeNo).setKey(dynamicKey).setProxy("120.39.142.214:40786,153.37.115.56:57433,42.84.173.2:55228"));
        System.out.println(resp);
    }

    /**
     * 动态代理 -- 设置代理IP白名单
     * @throws IllegalAccessException
     * 返回实例 {"msg":"请求成功","code":200,"data":{"white_ip_count":5,"current_white_ip":["1.1.1.1","2.2.2.2","30.30.30.30"],"surplus_white_ip_quantity":2}}
     */
    @org.junit.jupiter.api.Test
    public void dySetWhiteIp() throws IllegalAccessException {
        String resp = JuLiang.dynamicSetWhiteIp(new DynamicSetWhiteIp().setTrade_no(dynamicTradeNo).setKey(dynamicKey).setIps("2.2.2.2,30.30.30.30"));
        System.out.println(resp);
    }

    /**
     * 动态代理 -- 获取代理IP白名单
     *
     * 返回示例 {"msg":"成功","code":200,"data":{"white_ip_count":5,"current_white_ip":["1.1.1.1","2.2.2.2","30.30.30.30"],"surplus_white_ip_quantity":2}}
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public void dyGetWhiteIp() throws IllegalAccessException {
        String resp = JuLiang.dynamicGetWhiteIp(new DynamicGetWhiteIp().setTrade_no(dynamicTradeNo).setKey(dynamicKey));
        System.out.println(resp);
    }

    /**
     * 动态代理 -- 替换代理Ip白名单
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public void dyReplaceWhiteIp() throws IllegalAccessException {
        String resp = JuLiang.dynamicReplaceWhiteIp(new DynamicReplaceWhiteIp().setTrade_no(dynamicTradeNo).setKey(dynamicKey).setNew_ip("11.12.13.14,15.16.17.18").setOld_ip("3.3.3.9").setReset("1"));
        System.out.println(resp);
    }

    /**
     * 动态代理 -- 业务代理IP剩余数量
     * @throws IllegalAccessException
     * 返回示例 {"msg":"成功","code":200,"data":{"balance":4999880}}
     */
    @org.junit.jupiter.api.Test
    public void balance() throws IllegalAccessException {
        String resp = JuLiang.dynamicBalance(new DynamicBalance().setTrade_no(dynamicTradeNo).setKey(dynamicKey));
        System.out.println(resp);
    }

    /**
     * 动态代理 -- 获取代理剩余可用时长
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public  void dynamicremain() throws IllegalAccessException {
        String value = JuLiang.dynamicRemain(new DynamicRemain().setTrade_no(dynamicTradeNo).setKey(dynamicKey).setProxy("1.1.1.1:8082"));
        System.out.println(value);
    }


    /**
     * 独享代理 -- 获取白名单
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public  void alonegetwhiteip() throws IllegalAccessException {
        String value = JuLiang.aloneGetWhiteIp(new AloneGetWhiteIp().setTrade_no(aloneTradeNo).setKey(aloneKey));
        System.out.println(value);
    }

    /**
     * 独享代理 -- 设置IP白名单
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public  void setwhiteip() throws IllegalAccessException {
        String value = JuLiang.aloneSetWhiteIp(new AloneSetWhiteIp().setTrade_no(aloneTradeNo).setKey(aloneKey).setIps("10.10.10.10"));
        System.out.println(value);
    }

    /**
     * 独享代理 -- 获取独享代理详情
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public  void alonegetips() throws IllegalAccessException {
        String value = JuLiang.aloneGetIps(new AloneGetIps().setTrade_no(aloneTradeNo).setKey(aloneKey));
        System.out.println(value);
    }

    /**
     * 独享代理 -- 替换代理IP白名单
     * @throws IllegalAccessException
     */
    @org.junit.jupiter.api.Test
    public void aloneReplaceWhiteIp() throws IllegalAccessException {
        String resp = JuLiang.aloneReplaceWhiteIp(new AloneReplaceWhiteIp().setTrade_no(aloneTradeNo).setKey(aloneKey).setNew_ip("11.12.13.14,15.16.17.18").setOld_ip("3.3.3.9").setReset("1"));
        System.out.println(resp);
    }

}

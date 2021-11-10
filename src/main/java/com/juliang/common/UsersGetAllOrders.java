package com.juliang.common;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 账号相关接口
 * 获取账户下对应类型的所有正常状态订单
 */
@Data
@Accessors(chain = true)
public class UsersGetAllOrders {
    /**
     * key 用户秘钥
     */
    private String key;
    /**
     * 用户Id
     */
    private String user_id;
    /**
     * 产品类型
     */
    private Integer product_type;

}

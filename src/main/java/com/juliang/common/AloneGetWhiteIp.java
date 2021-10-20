package com.juliang.common;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AloneGetWhiteIp {

    /**
     * key 业务秘钥
     */
    private String key;
    /**
     * 业务号
     */
    private String trade_no;



}

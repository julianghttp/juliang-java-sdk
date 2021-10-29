package com.juliang.common;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AloneReplaceWhiteIp {

    /**
     * key 业务秘钥
     */
    private String key;
    /**
     * 业务号
     */
    private String trade_no;
    /**
     * 已存在,需要被替换的白名单IP
     */
    private String old_ip;
    /**
     * 替换的新的白名单IP
     */
    private String new_ip;
    /**
     * 是否重置已存在的白名单IP
     */
    private String reset;

}

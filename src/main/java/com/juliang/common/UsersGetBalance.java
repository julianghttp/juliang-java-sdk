package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UsersGetBalance {


    /**
     * key 用户秘钥
     */
    @NotBlank(message = "秘钥不能为空")
    private String key;
    /**
     * 用户Id
     */
    @NotBlank(message = "用户id必传")
    private Integer user_id;

}

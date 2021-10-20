package com.juliang.common;

import jakarta.validation.constraints.NotBlank;

public class UsersGetBalance {

    /**
     * 用户Id
     */
    @NotBlank(message = "用户id必传")
    private Integer user_id;

    /**
     * 获取用户ID
     * @return 用户ID
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * 设置用户ID
     * @param user_id 用户ID
     * @return
     */
    public UsersGetBalance setUser_id(Integer user_id) {
        this.user_id = user_id;
        return this;
    }

    public UsersGetBalance() {


    }
}

package com.juliang.common;


public class Auth {

    private String appId;
    private String appKey;

    public Auth(String appId, String appKey) {
        this.appId = appId;
        this.appKey = appKey;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }



}

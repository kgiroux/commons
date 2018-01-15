package com.giroux.kevin.dofustuff.commons.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

public class Provider {

    @JsonProperty(value = "provider")
    private final String provider = "password";
    @JsonProperty(value = "data")
    private String data;
    @JsonProperty(value = "app_id")
    private final String appId = "com.giroux.kevin.dofustuff";

    @JsonProperty(value = "user_info")
    private UserInfo user;

    public String getProvider() {
        return provider;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAppId() {
        return appId;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}

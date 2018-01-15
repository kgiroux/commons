package com.giroux.kevin.dofustuff.commons.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {

    @JsonProperty("password")
    private String password;

    @JsonProperty("register")
    private final Boolean register = false;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

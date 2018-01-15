package com.giroux.kevin.dofustuff.commons.security;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TokenData {

    @JsonProperty("app_id")
    private final String appId = "com.giroux.kevin.dofustuff";

    @JsonProperty("identity")
    private String identity;

    @JsonProperty("access")
    private List<String> access;

    @JsonProperty("salt")
    private String salt;

    @JsonProperty("expires")
    private long expires;

    @JsonProperty("is_admin")
    private Boolean isAdmin;


    public String getAppId() {
        return appId;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public List<String> getAccess() {
        return access;
    }

    public void setAccess(List<String> access) {
        this.access = access;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public long getExpires() {
        return expires;
    }

    public void setExpires(long expires) {
        this.expires = expires;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}

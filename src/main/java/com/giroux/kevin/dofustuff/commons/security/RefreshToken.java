package com.giroux.kevin.dofustuff.commons.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefreshToken {
    @JsonProperty("token")
    private String token;

    @JsonProperty("token_data")
    private TokenData tokenData;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenData getTokenData() {
        return tokenData;
    }

    public void setTokenData(TokenData tokenData) {
        this.tokenData = tokenData;
    }
}

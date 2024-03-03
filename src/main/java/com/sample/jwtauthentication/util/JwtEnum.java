package com.sample.jwtauthentication.util;

import lombok.Getter;

@Getter
public enum JwtEnum {
    BEARER("Bearer "),
    USERNAME("username"),
    JWTTOKEN("jwtToken"),
    AUTHORIZATION("Authorization");

    private String value;

    JwtEnum(String value){
        this.value = value;
    }


}

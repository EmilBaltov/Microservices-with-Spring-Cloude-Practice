package com.microservices.exercize.gateway.security;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.Base64;

public class JwtConfig {
    @Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    @Value("${security.jwt.header:Authorization}")
    private String header="Authorization";

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix="Bearer ";

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration=86400000;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secretKey="SecretKey";

//    @PostConstruct
//    protected void init() {
//        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
//    }


    public String getUri() {
        return Uri;
    }

    public String getHeader() {
        return header;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getExpiration() {
        return expiration;
    }

    public String getSecretKey() {
        return secretKey;
    }

}
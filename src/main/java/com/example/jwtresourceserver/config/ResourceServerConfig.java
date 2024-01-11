package com.example.jwtresourceserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig {

    @Value("${jwt.key}")
    private String jwtKey;

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter(){
        var converter=new JwtAccessTokenConverter();
        converter.setSigningKey(jwtKey);
        return converter;
    }
}

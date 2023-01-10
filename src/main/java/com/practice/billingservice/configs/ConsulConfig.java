package com.practice.billingservice.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // Not @Configuration <=> not working...
@ConfigurationProperties(prefix = "token") // Automatically take data from consul -> Key/Value -> config -> billing-service (because of dep and app.yml)
@Getter @Setter
public class ConsulConfig {

    private long accessTokenTimeout;
    private long refreshTokenTimeout;

}

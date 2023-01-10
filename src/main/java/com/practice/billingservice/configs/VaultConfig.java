package com.practice.billingservice.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // Not @Configuration <=> not working...
@ConfigurationProperties(prefix = "user") // Automatically take data from vault -> secret -> billing-service (because of dep and app.yml)
@Data
public class VaultConfig {

    private String lastname;
    private Long password;

}

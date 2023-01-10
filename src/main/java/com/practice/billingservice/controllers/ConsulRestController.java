package com.practice.billingservice.controllers;

import com.practice.billingservice.configs.ConsulConfig;
import com.practice.billingservice.configs.VaultConfig;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class ConsulRestController {

//    @Value("${token.accessTokenTimeout}") // In consul -> Key/Value -> config -> billing-service
//    private long accessTokenTimeout;
//
//    @Value("${token.refreshTokenTimeout}")
//    private long refreshTokenTimeout;
    
    private final ConsulConfig consulConfig;
    private final VaultConfig vaultConfig;

    public ConsulRestController(ConsulConfig consulConfig, VaultConfig vaultConfig) {
        this.consulConfig = consulConfig;
        this.vaultConfig = vaultConfig;
    }

    @GetMapping("/config")
    public Map<String, Object> getConfig() {
        return Map.of("ConsulConfig", consulConfig, "vaultConfig", vaultConfig);
    }

}

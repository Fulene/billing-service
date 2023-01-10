package com.practice.billingservice.controllers;

import com.practice.billingservice.configs.ConsulConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulRestController {

//    @Value("${token.accessTokenTimeout}") // In consul -> Key/Value -> config -> billing-service
//    private long accessTokenTimeout;
//
//    @Value("${token.refreshTokenTimeout}")
//    private long refreshTokenTimeout;
    
    private final ConsulConfig consulConfig;

    public ConsulRestController(ConsulConfig consulConfig) {
        this.consulConfig = consulConfig;
    }

    @GetMapping("/config")
    public ConsulConfig getConfig() {
        return consulConfig;
    }

}

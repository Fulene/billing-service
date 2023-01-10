package com.practice.billingservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsulRestController {

    @Value("${token.accessTokenTimeout}") // In consul -> Key/Value -> config -> billing-service
    private long accessTokenTimeout;

    @Value("${token.refreshTokenTimeout}")
    private long refreshTokenTimeout;

    @GetMapping("/config")
    public Map<String, Object> getConfig() {
        return Map.of("accessTokenTimeout", accessTokenTimeout, "refreshTokenTimeout", refreshTokenTimeout);
    }

}

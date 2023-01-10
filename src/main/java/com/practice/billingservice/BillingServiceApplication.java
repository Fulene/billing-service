package com.practice.billingservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.vault.core.VaultTemplate;

import java.util.Map;

@SpringBootApplication
public class BillingServiceApplication implements CommandLineRunner {
	private final VaultTemplate vaultTemplate;

	public BillingServiceApplication(VaultTemplate vaultTemplate) {
		this.vaultTemplate = vaultTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Override
	public void run(String... args) {
		vaultTemplate.opsForVersionedKeyValue("secret")
			.put("billing-service", Map.of("secret1", "the first secret", "secret2", "the scd secret"));
	}

}

package com.gatewayms.GatewayMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMsApplication.class, args);

		System.out.println("Gateway is running.");
	}
}
package com.capg.hcms.register_management_system;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class HcmsRegisterManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmsRegisterManagementSystemApplication.class, args);
	}

	@Bean
	public Random getRandom()
	{
		return new Random();
	}
}

package com.lorena.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Gen09Eureka2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gen09Eureka2ServerApplication.class, args);
	}

}

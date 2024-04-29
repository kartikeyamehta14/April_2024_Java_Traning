package com.npci.configrationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigrationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigrationServerApplication.class, args);
	}

}

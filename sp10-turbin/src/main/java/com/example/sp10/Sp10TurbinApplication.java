package com.example.sp10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableDiscoveryClient
@EnableTurbine
@SpringBootApplication
public class Sp10TurbinApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp10TurbinApplication.class, args);
	}

}

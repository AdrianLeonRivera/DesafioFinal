package com.bootcamp.desafiofinaleureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DesafioFinalEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioFinalEurekaApplication.class, args);
	}

}

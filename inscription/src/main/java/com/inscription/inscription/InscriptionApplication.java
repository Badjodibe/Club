package com.inscription.inscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.badjo.controller", "com.badjo.services"})
@EntityScan("com.badjo.model")
@EnableJpaRepositories("com.badjo.dao")
@EnableFeignClients("com.badjo.openfeign")
public class InscriptionApplication {
	
;
	public static void main(String[] args) {
		SpringApplication.run(InscriptionApplication.class, args);
	}

}

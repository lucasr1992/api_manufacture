package com.azuremyst.manutencao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ManutencaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManutencaoApplication.class, args);
	}

}

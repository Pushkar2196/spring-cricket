package com.example.springcricket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.springcricket.repository")
@SpringBootApplication
public class SpringCricketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCricketApplication.class, args);
	}

}

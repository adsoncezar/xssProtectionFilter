package com.xss.xssprotection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.xss.xssprotection.repository")
public class XssprotectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(XssprotectionApplication.class, args);
	}

}

package com.jwt.auth.jwtpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

@SpringBootApplication
public class JwtPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtPracticeApplication.class, args);
	}

}

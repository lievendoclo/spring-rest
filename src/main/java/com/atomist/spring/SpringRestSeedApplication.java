package com.atomist.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class SpringRestSeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSeedApplication.class, args);
	}
}

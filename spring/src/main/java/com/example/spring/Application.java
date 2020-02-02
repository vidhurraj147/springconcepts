package com.example.spring;

import java.text.NumberFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public NumberFormat defaultCurrentFormat() {
		return NumberFormat.getCurrencyInstance();
	}
	
	

}

package com.example.validation;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationApplication.class, args);
	}

@Bean
	public ModelMapper model()
	{
		return new ModelMapper();
	}
}

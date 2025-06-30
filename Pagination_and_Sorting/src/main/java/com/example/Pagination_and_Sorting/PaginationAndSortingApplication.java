package com.example.Pagination_and_Sorting;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaginationAndSortingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationAndSortingApplication.class, args);
	}
	@Bean
    public ModelMapper modelmapper()
	{
		return new ModelMapper();
	}
}

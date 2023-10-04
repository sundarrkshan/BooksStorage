package com.tutorial.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	@Bean
	public CommandLineRunner test(BookRepository bookRepository)
	{
		return args -> {
			Book book1 = new Book("Book A", BigDecimal.valueOf(2.34), LocalDate.of(1958, 01, 25));
			Book book2 = new Book("Book B", BigDecimal.valueOf(25.58), LocalDate.of(2010, 01, 12));

			Book book3 = new Book("Book C", BigDecimal.valueOf(72.94), LocalDate.of(2008, 01, 15));
			Book book4 = new Book("Book D", BigDecimal.valueOf(44.34), LocalDate.of(1998, 01, 10));

			bookRepository.save(book1);
			bookRepository.save(book2);
			bookRepository.save(book3);
			bookRepository.save(book4);

		};


	}

}

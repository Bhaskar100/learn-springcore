package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringcoreApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext  cac =SpringApplication.run(LearnSpringcoreApplication.class, args);
		
		Person person = cac.getBean(Employee.class);
		
		person.demo();
	
	}

}

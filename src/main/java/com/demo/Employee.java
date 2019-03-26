package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Person {

	@Autowired
	Person person;
	
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
		System.out.println("demo in employee");
		
		person.demo();
		
		
	}


	
}

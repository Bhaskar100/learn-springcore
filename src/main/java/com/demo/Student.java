package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person{

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
		System.out.println("demo in student");
		
	}

	
}

package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Teacher implements Person {

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
		System.out.println("demo in teacher");
	}
	
	
}

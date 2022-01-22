package com.test.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("prototypeContext.xml");
		
		Coach coachA = context.getBean("myCoach", Coach.class);
		
		Coach coachB = context.getBean("myCoach", Coach.class);
		
		System.out.println(coachA == coachB);
		
		System.out.println(coachA);
		
		System.out.println(coachB);
		
		context.close();

	}

}

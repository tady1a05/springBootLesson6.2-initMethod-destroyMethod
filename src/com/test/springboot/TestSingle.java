package com.test.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("singleContext.xml"); /*get the context from applicationContext.xml*/
		
		Coach coachA = context.getBean("myCoach", swimCoach.class);
	
		Coach coachB = context.getBean("myCoach", swimCoach.class);
		
		System.out.println(coachA == coachB);
		
		System.out.println(coachA);
		
		System.out.println(coachB);
		
		context.close();

	}

}

package com.prowings.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("computerContext.xml");
		
		Computer obj1 = ctx.getBean(Computer.class);
		System.out.println(obj1);
	}

}

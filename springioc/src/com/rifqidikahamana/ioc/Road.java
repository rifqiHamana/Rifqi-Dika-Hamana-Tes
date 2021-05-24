package com.rifqidikahamana.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Road {
	
	public static void main(String[] args) {
		
		License license = new A();
		license.calling();
		license.data();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext();
		
	}

}

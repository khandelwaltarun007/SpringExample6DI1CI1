package com.spring.example6di1ci1;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6DI1CI1Test {
	public static final Logger log = Logger.getLogger(Spring6DI1CI1Test.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("employeeBean");
		employee.displayInfo();
	}
}

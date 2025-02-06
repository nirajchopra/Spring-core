package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("TestMultiple.xml");
		
		UserBean user = (UserBean) context.getBean("user");
		
		Person person = (Person) context.getBean("personBean");
		
		System.out.println("User Name: " + user.getLogin());
		System.out.println("User Password: " + user.getPassword());
		System.out.println("Person Name: " + person.getName());
	}

}

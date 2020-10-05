package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Standard Java
	/*	Person person = new Person();
		person.speak();*/
		
		// Spring way
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Person person = (Person)context.getBean("person");
		person.speak();
		Address address = (Address)context.getBean("address");
		System.out.println(address);
		
		System.out.println(person.toString());
		((FileSystemXmlApplicationContext) context).close();

	}

}

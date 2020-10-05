package com.vladancupric;

public class Person {
	private int jmbg;
	private String name;
	private int age;
	private Address address;
	
	
	
	public Person() {
	}
	
	public Person(int jmbg, String name) {
		super();
		this.jmbg = jmbg;
		this.name = name;
	}
		
	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Person [jmbg=" + jmbg + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public void speak(){
		System.out.println("Hello, I am "+ name);
	}
	public void onCreate() {
		System.out.println("Kreiran objekat Person " + this);
		
	}
	public void onDestroy() {
		System.out.println("Objekat Person je unisten" + this);
	}

}

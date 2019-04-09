package com.spring.spel;

public class User {
	
	private String name;//="momo";
	private Integer age;
	private double pi;
	private Person p;
	
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//System.out.println("setName");
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public void method(){
		System.out.println("method--");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", pi=" + pi + ", p="
				+ p + "]";
	}
	
	
}

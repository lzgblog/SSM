package com.spring.setter;

public class User {
	
	private String name;
	private Integer age;
	private Address homeAddr;
	private Address comAddr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}
	public Address getComAddr() {
		return comAddr;
	}
	public void setComAddr(Address comAddr) {
		this.comAddr = comAddr;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", homeAddr=" + homeAddr
				+ ", comAddr=" + comAddr + "]";
	}
	
	
	
	
	
}

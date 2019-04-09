package com.springaop.aop;

public class UserServiceImpl implements UserService {

	
	public void addUser() {
		System.out.println("addUser_AOP");
	}

	
	public void updateUser() {
		System.out.println("updateUser_AOP");

	}

	
	public void deleteUser() {

		System.out.println("deleteUser_AOP");
	}

}

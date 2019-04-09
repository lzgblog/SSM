package com.springaop.aspectj_xml;

public class UserServiceImpl implements UserService {

	
	public void addUser() {
		System.out.println("addUser_aspectj_xml");
	}

	
	public String updateUser() {
		System.out.println("updateUser_aspectj_xml");
		//int i=1/0;
		return "good";
	}

	
	public void deleteUser() {

		System.out.println("deleteUser_aspectj_xml");
	}

}

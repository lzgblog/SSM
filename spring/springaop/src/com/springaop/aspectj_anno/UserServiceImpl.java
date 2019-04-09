package com.springaop.aspectj_anno;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	public void addUser() {
		System.out.println("addUser_aspectj_anno");
	}

	
	public String updateUser() {
		System.out.println("updateUser_aspectj_anno");
		//int i=1/0;
		return "good";
	}

	
	public void deleteUser() {

		System.out.println("deleteUser_aspectj_anno");
	}

}

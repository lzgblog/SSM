package com.springaop.cglib;
//目标实现类
public class TargetServiceImpl{

	public void add() {
		System.out.println("add_TargetServiceImpl");
	}

	public void update() {
		System.out.println("update_TargetServiceImpl");
	}

	public void delete() {
		System.out.println("delete_TargetServiceImpl");
	}

}

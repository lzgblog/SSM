package com.springaop.proxy;
//目标实现类
public class TargetServiceImpl implements TargetService {

	@Override
	public void add() {
		System.out.println("add_TargetServiceImpl");
	}

	@Override
	public void update() {
		System.out.println("update_TargetServiceImpl");
	}

	@Override
	public void delete() {
		System.out.println("delete_TargetServiceImpl");
	}

}

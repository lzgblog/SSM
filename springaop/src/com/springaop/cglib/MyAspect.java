package com.springaop.cglib;

public class MyAspect {
	public void before(){
		System.out.println("cglib前。。。。");
	}
	public void after(){
		System.out.println("cglib后。。。。");
	}
}

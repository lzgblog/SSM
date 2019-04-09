package com.springaop.cglib;

import org.junit.Test;

public class TestCglib {
	@Test
	public void test1(){
		TargetServiceImpl target =CGLibFactory.cglibFactory();
		target.add();
		target.update();
		target.delete();
		
	}
}	

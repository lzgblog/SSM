package com.springaop.proxy;

import org.junit.Test;

public class TestPro {
	@Test
	public void test1(){
		TargetService target = ProxyFactory.proxyFactory();
		target.add();
		target.update();
		target.delete();
		
	}
}	

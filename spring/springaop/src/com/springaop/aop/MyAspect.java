package com.springaop.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("前。。。。。");
		Object proceed = method.proceed();
		System.out.println("后。。。。");
		return proceed;
	}
	
}

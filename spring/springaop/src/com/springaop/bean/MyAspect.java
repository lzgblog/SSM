package com.springaop.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类中确定通知，需要实现不同接口，接口就是规范，从而就确定方法名称。
 * import org.aopalliance;包下的接口
 * * 采用“环绕通知” MethodInterceptor
 *
 */

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("before----");
		//手动执行方法
		Object proceed = method.proceed();
		System.out.println("after-----");
		return proceed;
	}
	
}

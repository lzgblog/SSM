package com.springaop.aspectj_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {
	
	public void mybefore(JoinPoint jointpoint){
		System.out.println("前置。。"+jointpoint.getSignature().getName());
	}
	//可以获得返回值
	public void afterReturning(JoinPoint joinpoint,Object ret){
		System.out.println("前置。。"+joinpoint.getSignature().getName()+"--》"+ret);
	}
	/**
	 * 
	 * 返回值类型：Object
			方法名：任意
			参数：org.aspectj.lang.ProceedingJoinPoint
			抛出异常
			执行目标方法：Object obj = joinPoint.proceed();

	 * @param joinpoint
	 * @return
	 * @throws Throwable
	 */
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("前....");
		Object proceed = joinpoint.proceed();
		System.out.println("后....");
		return proceed;
	}
	public void afterThrowing(JoinPoint joinpoint,Throwable e){
		System.out.println(joinpoint.getSignature().getName()+"-->"+e.getMessage());
	}
}

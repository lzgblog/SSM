package com.springaop.aspectj_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类，含有多个通知
 */

@Component
//切面类注解
@Aspect
public class MyAspectAnno {
	//私有  切入点当前有效
	//@Before("execution(* com.springaop.aspectj_anno.UserServiceImpl.*(..))")
	public void mybefore(JoinPoint jointpoint){
		System.out.println("前置。。"+jointpoint.getSignature().getName());
	}
	
	//创建一个公共的切入点
	@Pointcut("execution(* com.springaop.aspectj_anno.UserServiceImpl.*(..))")
	public void myPointCut(){
		
	}
	//@AfterReturning(value="myPointCut()",returning="ret")
	public void afterReturning(JoinPoint joinpoint,Object ret){
		System.out.println("前置。。"+joinpoint.getSignature().getName()+"--》"+ret);
	}
	//@Around(value="execution(* com.springaop.aspectj_anno.UserServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("前....");
		Object proceed = joinpoint.proceed();
		System.out.println("后....");
		return proceed;
	}
	@AfterThrowing(value="myPointCut()",throwing="e")
	public void afterThrowing(JoinPoint joinpoint,Throwable e){
		System.out.println(joinpoint.getSignature().getName()+"-->"+e.getMessage());
	}
}

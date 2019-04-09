package com.springaop.cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
//cglib字节码增强   代理模式   目标类没有接口的情况下
public class CGLibFactory {
	public static TargetServiceImpl cglibFactory(){
		//目标类
		final TargetServiceImpl ts = new TargetServiceImpl();
		//切面类
		final MyAspect myAspect = new MyAspect();
		// 3.代理类 ，采用cglib，底层创建目标类的子类
		//3.1 核心类
		Enhancer enhancer=new Enhancer();
		//确定父类
		enhancer.setSuperclass(ts.getClass());
		//回调函数
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] arg2,
					MethodProxy arg3) throws Throwable {
				//前方法
				myAspect.before();
				//执行目标方法
				Object obj = method.invoke(ts, arg2);
				//methodProxy.invokeSuper(proxy, args);//再执行一次目标方法
				//后方法
				myAspect.after();
				return obj;
			}
		});

		//创建代理类
		TargetServiceImpl proxy=(TargetServiceImpl) enhancer.create();
		return proxy;
	}
}

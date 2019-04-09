package com.spring.lifecycle;

import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * spring 提供一种机制，只要实现此接口BeanPostProcessor， 并将实现类提供给spring容器，spring容器将自动执行
	 * ，在初始化方法前执行before()，在初始化方法后执行after() 。 配置<bean
	 * class="com.spring.lifecycle.MyBeanPostProcessor"> 如果返回为null 下次调用会引发空指针异常
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("方法前" + bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, String beanName)
			throws BeansException {
		System.out.println("方法后" + bean);
		// 代理模式
		// bean 目标对象
		// spring提供工厂勾子，用于修改实例对象，可以生成代理对象，是AOP底层。
		return Proxy.newProxyInstance(MyBeanPostProcessor.class
				.getClassLoader(), bean.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object arg0, Method method, Object[] arg2)
							throws Throwable {
						System.out.println("before---");
						Object o=method.invoke(bean, arg2);//factory
						//获得执行的方法名
						System.out.println(method.getName());
						System.out.println("after----");
						return o;
					}
				});
	}

}

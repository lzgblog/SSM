package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv=new ModelAndView();
		//向名为hello的application域中添加内容
		mv.addObject("hello","welcome to springmvc");
		//设置跳转的页面   写完路径不需要配置InternalResourceViewResolve解析器
		//mv.setViewName("/WEB-INF/jsps/index.jsp");
		
		//设置跳转页面   需要配置InternalResourceViewResolve解析器
		mv.setViewName("index");
		return mv;
	}

}

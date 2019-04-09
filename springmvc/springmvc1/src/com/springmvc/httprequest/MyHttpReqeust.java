package com.springmvc.httprequest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class MyHttpReqeust implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//向request域中设置值
		request.setAttribute("hello", "Use MyHttpRequest Class");
		//跳转页面
		request.getRequestDispatcher("/WEB-INF/jsps/index.jsp").forward(request, response);
	}

}

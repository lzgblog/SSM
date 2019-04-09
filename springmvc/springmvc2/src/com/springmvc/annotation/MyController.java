package com.springmvc.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MyController {
	@RequestMapping("s")
	public String hello() {
		
		return "index";
	}
}

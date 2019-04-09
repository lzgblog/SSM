package com.springmvc.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//回显数据
@Controller
public class ReturnData {
	@RequestMapping("list")
	public String list(Model model){
		List<User> list=new ArrayList<User>();
		User user1=new User();
		user1.setId("1");
		user1.setAge("18");
		user1.setName("张三");
		User user2=new User();
		user2.setId("2");
		user2.setAge("20");
		user2.setName("李四");
		list.add(user1);
		list.add(user2);
		model.addAttribute("list",list);
		return "view";
	}
}

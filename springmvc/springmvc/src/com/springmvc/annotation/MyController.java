package com.springmvc.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class MyController {
	@RequestMapping("ss")//页面访问路径
	public String index() {
		
		return "index";//跳转的页面
	}
	@RequestMapping(value="/hello.do",method={RequestMethod.GET,RequestMethod.POST})
	public String hello(){
		return "hello";
	}
	//封装int类型参数   
	//原始方式 传达参数  http://localhost/springmvc/user/recivedID.do?id=${user.id}
	//当访问地址为 如： http://localhost/springmvc/user/recivedID/${user.id}.do  时  把参数id放入请求体中 用@PathVariable注解获取
	@RequestMapping("/recivedID/{id}")
	public String recivedID(@PathVariable int id){
		System.out.println(id);
		return "success";
	}
	//接受字符型参数
	@RequestMapping("recivedName")
	public String recivedName(String username){
		System.out.println(username);
		return "success";
	}
	//接收数组类型
	@RequestMapping("recivedArgu")
	public String recivedArgu(Integer[] ids){
		for (Integer id : ids) {
			System.out.println(id);
		}
		return "success";
	}
	//接受pojo类型
	@RequestMapping("recivedPOJO")
	public String recivedPOJO(User user){
		System.out.println(user.getName());
		return "success";
	}
	//接受包装pojo类型
	@RequestMapping("recivedUserCost")
	public String recivedUserCost(UserCost user){
		System.out.println(user.getUser().getAge());
		System.out.println(user.getUser().getName());
		return "success";
	}
	//接收集合类型
	@RequestMapping("recivedList")
	public String recivedList(UserCost userCost){
		System.out.println(userCost.getUser().getName());
		return "success";
	}
	//接受Map集合
	@RequestMapping("recivedMap")
	public String recivedMap(UserCost userCost){
		System.out.println(userCost);
		return "success";
	}
	//重定向
	@RequestMapping("redirect")
	public String redirect(){
		return "redirect:/user/ss.do";
	}
	//转发：foward:/user/ss.do
	
	//多视图支持
	//访问地址：http://localhost/springmvc/rest/user/view.xml
			//http://localhost/springmvc/rest/user/view.json
	@RequestMapping("view")
	public User view(){
		User user=new User();
		user.setId("1");
		user.setAge("18");
		user.setName("tom");
		return user;
	}
}

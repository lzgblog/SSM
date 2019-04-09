package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Item;
import com.ssm.service.MyService;

@Controller
@RequestMapping("/item")
public class MyController {
	@RequestMapping("login")
	public String login(){
		
		return "index";
	}
	@Resource
	private MyService myService;
	//查询商品列表
	@RequestMapping("findItems")
	public String findItems(Model model){	
		List<Item> list=myService.findItemsAll();
		model.addAttribute("list",list);
		return "itemsList";
	}
	//通过id查找商品信息
	@RequestMapping("edit")
	public String edit(Integer id,Model model){
		Item item=myService.findItemById(id);
		model.addAttribute("item",item);
		return "editItem";
	}
	//修改表单信息
	@RequestMapping("update")
	public String update(Item item){
		myService.updateItem(item);
		return "redirect:/item/findItems";
	}
	//跳转到添加商品页面
	@RequestMapping("toAddItem")
	public String toAddItem(){
		return "addItem";
	}
	//添加商品
	@RequestMapping("addItem")
	public String addItem(Item item){
		myService.insertItem(item);
		return "redirect:/item/findItems";
	}
	//根据id删除商品信息
	@RequestMapping("deleteItem")
	public String deleteItem(Integer id){
		myService.deleteItemById(id);
		return "redirect:/item/findItems";
	}
	//批量删除
	@RequestMapping("deleteAllItems/{ids}")
	public String deleteAllItems(@PathVariable Integer[] ids){
		for (Integer id : ids) {
			System.out.println(id);
		}
		return "redirect:/item/findItems";
	}
	//访问页面静态化
	@RequestMapping("ftl")
	public String ftl(Model model){
		model.addAttribute("hello", "welcome to freemarker");
		return "freemarker";
	}
}

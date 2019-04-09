package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Item;

public interface MyService {
	
	//查找所有商品信息
	public List<Item> findItemsAll();
	//根据id查找商品信息
	public Item findItemById(Integer id);
	//修改商品信息
	public void updateItem(Item item);
	//添加商品信息
	public void insertItem(Item item);
	//根据Id删除商品信息
	public void deleteItemById(Integer id);
	
}

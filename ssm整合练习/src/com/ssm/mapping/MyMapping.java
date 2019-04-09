package com.ssm.mapping;

import java.util.List;

import com.ssm.pojo.Item;

public interface MyMapping {
	//查询所有商品信息
	public List<Item> findItems();
	//根据id查找商品
	public Item findItemById(Integer id);
	//修改商品信息
	public void updateItem(Item item);
	//添加商品信息
	public void insertItem(Item item);
	//根据id删除商品信息
	public void deleteItemById(Integer id);
}

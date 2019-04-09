package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.mapping.MyMapping;
import com.ssm.pojo.Item;

@Service
public class MyServiceImpl implements MyService {
	
	@Resource
	private MyMapping myMapping;
	@Override
	public List<Item> findItemsAll() {
		List<Item> list=myMapping.findItems();
		return list;
	}
	@Override
	public Item findItemById(Integer id) {
		Item item=myMapping.findItemById(id);
		return item;
	}
	@Override
	public void updateItem(Item item) {
		myMapping.updateItem(item);
	}
	@Override
	public void insertItem(Item item) {
		myMapping.insertItem(item);
	}
	@Override
	public void deleteItemById(Integer id) {
		myMapping.deleteItemById(id);
	}
	
}

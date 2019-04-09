package com.mybatis.mapper;

import java.util.List;

import com.mybatis.po.OrdersEx;
import com.mybatis.po.User;

public interface OrdersMapper {
	//一对一    查询订单信息，关联查询用户信息
	public List<OrdersEx> findUserAndOrders();	
	//一对一   ResultMap方式
	public List<OrdersEx> findUserAndOrdersAsRetMap();
	//一对多   查询订单信息，关联查询订单明细信息及用户信息
	public List<OrdersEx> findUserAndOrdersAndDetail();
	//多对多   查询用户信息，关联查询该用户购买的商品信息
	public List<User> findUserAndOrdersAndDetailAndItems();
	//根据id查找用户信息     二级缓存ehcache
	public User findUserById(int id);
}

package com.mybatis.po;

import java.util.List;

public class OrdersEx extends Orders{
	private String username;
	private String sex;
	
	//User对象
	private User user;
	
	//Orderdetail对象
	private List<Orderdetail> orderdetail;
	
	public List<Orderdetail> getOrderdetail() {
		return orderdetail;
	}

	public void setOrderdetail(List<Orderdetail> orderdetail) {
		this.orderdetail = orderdetail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrdersEx [username=" + username + ", sex=" + sex + ", user=" + user + ", orderdetail=" + orderdetail
				+ "]";
	}

	
	
}

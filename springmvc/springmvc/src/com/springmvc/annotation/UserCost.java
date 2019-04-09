package com.springmvc.annotation;

import java.util.List;
import java.util.Map;

public class UserCost {
	private User user;
	private List<User> userList;
	private Map<String,Object> maps;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	@Override
	public String toString() {
		return "UserCost [user=" + user + ", userList=" + userList + ", maps="
				+ maps + "]";
	}
	

	
}

package com.spring.setter;

public class Address {
	private String addr;
	private int tel;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Address [add=" + addr + ", tel=" + tel + "]";
	}
	
	
}

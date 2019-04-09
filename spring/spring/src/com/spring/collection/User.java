package com.spring.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;


public class User {
	
	private String[] arraydata;
	private List<String> listdate;
	private Map<String,String> mapdata;
	private Properties prop;
	public String[] getArraydata() {
		return arraydata;
	}
	public void setArraydata(String[] arraydata) {
		this.arraydata = arraydata;
	}
	public List<String> getListdate() {
		return listdate;
	}
	public void setListdate(List<String> listdate) {
		this.listdate = listdate;
	}
	public Map<String, String> getMapdata() {
		return mapdata;
	}
	public void setMapdata(Map<String, String> mapdata) {
		this.mapdata = mapdata;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "User [arraydata=" + Arrays.toString(arraydata) + ", \nlistdate="
				+ listdate + ", \nmapdata=" + mapdata + ", \nprop=" + prop + "]";
	}
	
	
	
}

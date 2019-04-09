package com.spring.annotation.account;

public interface AccountService {
	/**
	 * 
	 * @param outer  转出
	 * @param inner	  转入
	 * @param money	 金额
	 */
	public void tranfer(String outer,String inner,Integer money);
}

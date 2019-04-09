package com.spring.annotation.account;

public interface AccountDao {
	/**
	 * 转账
	 * @param inner
	 * @param money
	 */
	
	public void out(String outer,Integer money);
	public void in(String inner,Integer money);
}

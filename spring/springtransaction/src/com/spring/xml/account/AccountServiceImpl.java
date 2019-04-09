package com.spring.xml.account;


public class AccountServiceImpl implements AccountService {
	
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void tranfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//断电
//		int i=1/0;
		accountDao.in(inner, money);
	}	

}

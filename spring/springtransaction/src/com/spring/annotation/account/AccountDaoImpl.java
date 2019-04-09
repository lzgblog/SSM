package com.spring.annotation.account;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//继承JdbcDaoSupport类
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void out(String outer, Integer money) {
		this.getJdbcTemplate().update("update account set account=account-? where name=?",money,outer);
	}
	
	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account set account=account+? where name=?",money,inner);
	}

}

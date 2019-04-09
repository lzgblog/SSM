package com.springaop.jdbcdaosupport;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

//继承JdbcDaoSupport模板类   内部创建了  JdbcTemplate对象    需要传入数据源即可
public class UserDao extends JdbcDaoSupport{
	
	/*//setter方法给spring
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/


	/*public void insert(User user) {
		jdbcTemplate.update("INSERT INTO USER(NAME,PASSWORD) VALUES(?,?)",user.getName(),user.getPassword());
	}
*/

	public void update(User user) {
		this.getJdbcTemplate().update("UPDATE USER SET NAME=?,PASSWORD=? WHERE id=15",user.getName(),user.getPassword());
	}
	
	public List<User> query() {
		return this.getJdbcTemplate().query("select * from user", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}

	public User findUser(String name) {
		return this.getJdbcTemplate().queryForObject("select * from user where name=?", ParameterizedBeanPropertyRowMapper.newInstance(User.class),name);
	}

	
	

	
}

package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Login;
import com.demo.beans.Register;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	JdbcTemplate jdbcTempate;

	@Override
	public Login validate(Login l1) {
		// TODO Auto-generated method stub
		return jdbcTempate.queryForObject("select * from login where username=? and password=?",new  Object[] {l1.getUsername(),l1.getPassword()}, BeanPropertyRowMapper.newInstance(Login.class));		
		}

	@Override
	public Register addUser(Register r1) {
		// TODO Auto-generated method stub
		//getUsername,getPassword,getEmaiId,getType,getGender,getMobileNumber
		int add = jdbcTempate.update("insert into registeration values (?,?,?,?,?,?)", new Object[]{r1.getUsername(), r1.getPassword(), r1.getEmaiId(), r1.getType(), r1.getGender(), r1.getMobileNumber()});
		if(add>0) {
			return r1;
		}
		return null;
	}
	//getUsername, getPassword, getEmailid, getType
	@Override
	public void addLogin(Login l2) {
		jdbcTempate.update("insert into login values (?,?,?,?)", new Object[] {l2.getUsername(), l2.getPassword(), l2.getEmailid(), l2.getType()});
		
	}


	}
	
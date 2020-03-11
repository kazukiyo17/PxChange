package com.lxy.exchange.service;

import com.lxy.exchange.entity.User;

/**
 * 用户操作Service接口
 * @author kazukiyo
 *
 */
public interface UserService {

	public User verifyUserByAccountPwd(String userAccount,String password);
	
	public User addUser(String email, String username, String password);
}

package com.lxy.exchange.service;

import com.lxy.exchange.entity.User;

/**
 * �û�����Service�ӿ�
 * @author kazukiyo
 *
 */
public interface UserService {

	public User verifyUserByAccountPwd(String userAccount,String password);
	
	public User addUser(String email, String username, String password);
}

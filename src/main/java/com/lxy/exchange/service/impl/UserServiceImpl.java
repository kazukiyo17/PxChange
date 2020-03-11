package com.lxy.exchange.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxy.exchange.dao.UserMapper;
import com.lxy.exchange.entity.User;
import com.lxy.exchange.entity.UserExample;
import com.lxy.exchange.service.UserService;
import com.lxy.exchange.tool.IdWorker;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	private IdWorker offerIdCreator=new IdWorker(1,1,2);
	
	@Override
	public User verifyUserByAccountPwd(String userAccount,String password) {
		System.out.println("UserServiceImpl verifyUserByAccountPwd");			//TEST
		UserExample example=new UserExample();
		example.createCriteria().andUserAccountEqualTo(userAccount);
		List<User> userlist = userMapper.selectByExample(example);
		System.out.println("userlist"+userlist.get(0).getUserPassword());			//TEST
		//暂且当作一个Account只对应一个用户的情况
		if(userlist.get(0).getUserPassword().equals(password)) {
			System.out.println("User exist"+userlist.get(0));			//TEST
			return userlist.get(0);
		}
		return null;
	}
	
	@Override
	public User addUser(String email, String username, String password) {
		User user=new User();
		user.setUserAccount(email);
		user.setUserApplyper(0);
		user.setUserDemandfinish(0);
		user.setUserDescription(null);
		user.setUserPassword(password);
		user.setUserUsername(username);
		user.setUserId(String.valueOf(offerIdCreator.nextId()));
		if(userMapper.insert(user)==1) {
			return user;
		}else {
			return null;
		}
	}
}

package com.lxy.exchange.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxy.exchange.entity.User;
import com.lxy.exchange.service.UserService;

@Controller
//@RequestMapping("/user")
public class UserController {
	
	@Resource
	UserService userService;
	
	@RequestMapping("/loginpage")
	public String toLoginPage() {
		return "login";
	}
	
	@RequestMapping("/registerpage")
	public String toRegisterPage() {
		return "register";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> login(@RequestParam("useraccount") String useraccount,
			@RequestParam("password") String password,HttpSession session){
		System.out.println("UserController login");			//TEST
		System.out.println(useraccount+password);			//TEST
		Map<String,String> map = new HashMap<String,String>();
		User user=userService.verifyUserByAccountPwd(useraccount, password);
		if(user!=null) {
			session.setAttribute("userid",user.getUserId());
			session.setAttribute("useraccount",user.getUserAccount());
			session.setAttribute("username",user.getUserUsername());
			map.put("result", "success");
			System.out.println("UserController success"+map);			//TEST
			return map;
		}else {
			map.put("result", "fail");
			System.out.println("UserController fail");			//TEST
			return map;
		}
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> register(@RequestParam("email") String email,
			@RequestParam("username") String username,
			@RequestParam("password") String password,HttpSession session) throws Exception {
		System.out.println("UserController register");			//TEST
		Map<String,String> map = new HashMap<String,String>();
		User user=userService.addUser(email, username, password);
		if(user!=null) {
			session.setAttribute("userid",user.getUserId());
			session.setAttribute("useraccount",user.getUserAccount());
			session.setAttribute("username",user.getUserUsername());
			map.put("result", "success");
			System.out.println("UserController success"+map);			//TEST
			return map;
		}else {
			map.put("result", "fail");
			System.out.println("UserController fail");			//TEST
			return map;
		}
	}

}

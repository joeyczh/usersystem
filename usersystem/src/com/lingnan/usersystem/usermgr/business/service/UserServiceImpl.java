package com.lingnan.usersystem.usermgr.business.service;
/**
 * 用户service接口的实现类
 * @author Acer
 *
 */
public class UserServiceImpl  implements UserService{
	
	private static UserService userService = new UserServiceImpl();
	
	private UserServiceImpl(){
		
	}
	
	public static UserService getInstance(){
		return userService;
	}
	

}

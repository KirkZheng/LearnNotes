package com.kk.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserServicesImpl implements UserServices {
	private Map<String,User>userMaps=new HashMap<String,User>();
	public UserServicesImpl() {
		User  u = new User("123", "张三", 1, "123");
		User  u2 = new User("124", "李四", 2, "124");
		User  u3 = new User("125", "王五", 3, "125");
		userMaps.put("123", u);
		userMaps.put("124", u2);
		userMaps.put("125", u3);
	}
	//创建登录方法
	public void login(String account,String password)throws LoginException{
		Set<String> keys=userMaps.keySet();
		for(String string : keys) {
			if(account.equals(string)) {
				User u=userMaps.get(account);
			if(u.getPassword().equals(password)) {
				System.out.println(u.getName());
				return;
			}else {
				throw new LoginException("密码错误，请重新输入");
			}
		}
	}
	throw new LoginException("没有这个账户，请注册后再次尝试");
	}
	//创建注册方法
	public void register(String account,String password,String rePassword)throws RegisterException {
		Set<String> keys=userMaps.keySet();
		for(String string : keys) {
			//判断是够有该用户
			if(string.equals(account)) {
				throw new RegisterException("该账户已经存在，请重新输入");
			}
		}
			if(!password.equals(rePassword)) {
				throw new RegisterException("两次密码不一致，请重新输入");
				}
			User u=new User(account,"",0,password);
			userMaps.put(account,u);
			
	}
}

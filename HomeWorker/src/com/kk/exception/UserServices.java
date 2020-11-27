package com.kk.exception;


/*
 
	创建UserServices接口定义2个方法, login(2个参数)/register(3个参数)
	创建实现类UserServicesImpl实现接口,并设置全员属性Map,key为User的account,Value为User实例,用于保存用户以注册信息
	创建自定义异常RegisterExecption,LoginExecption
	register 方法在以下两种情况下抛出异常：
	1） username 在Map 中已存在 
	2） 两次输入的password 不一致
	login 方法在以下两种情况下抛出异常： 
	1） username 不存在 
	2） username 和password 不匹配

	Test中测试
 * @author kz96
 */
public interface UserServices {
	//登录只需要账户和密码
	void login(String account,String password) throws LoginException;
	//注册需要账户以及重复两遍密码
	void register(String account,String password,String rePassword) throws RegisterException ;
}

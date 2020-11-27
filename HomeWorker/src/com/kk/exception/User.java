package com.kk.exception;
/*
 * * 创建类User 属性account,name,age,password 
 * @author kz96
 */
public class User {
	private String account;
	private String name;
	private int age;
	private String password;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String account, String name, int age, String password) {
		super();
		this.account = account;
		this.name = name;
		this.age = age;
		this.password = password;
	}
	public User() {
		super();
	}
	
	
}

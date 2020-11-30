package com.kk.test;

import java.util.HashSet;
import java.util.Set;

/*
 * 2.如何判断两个HashSet集合是否有交集，并打印出他们的交集（10分）
 */
public class Test2 {
	public static void main(String[] args) {
		//创建第一个子集
		Set<String>set1=new HashSet<String>();
		set1.add("芒果");
		set1.add("梨子");
		set1.add("哈密瓜");
		//创建第二个子集
		Set<String>set2=new HashSet<String>();
		set2.add("西瓜");
		set2.add("葡萄");
		set2.add("哈密瓜");
		//创建一个集和用来接收他们的交集
		Set<String>set3=new HashSet<String>();
		for(String s:set1) {
			if(set2.contains(s)) {
				set3.add(s);	
			}
		}
		System.out.println("子集是："+set3);
	}
}

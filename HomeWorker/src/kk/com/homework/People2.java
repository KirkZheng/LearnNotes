package kk.com.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * HashSet的简单使用
 * @auther kz96
 * 
 */
public class People2 {
	//创建一个集合，并保存数据
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("JavaEE");
		set.add("JavaSE");
		//输出元素个数
		System.out.println(set.size());
		//遍历数据
		for(String string : set) {
			System.out.println(string);
		}
		set.add("JavaME");
		System.out.println(set.size());
		//第二种遍历方式
		Iterator<String> i=set.iterator();
		while(i.hasNext()){
			String a=i.next();
			System.out.println(a);
		}
		set.add("Java");
		//查看元素中是否包含某个数据
		System.out.println(set.contains("Java"));
		//清空所有元素
		//set.clear();
		//增加数据
		set.remove("JavaME");
		System.out.println(set.size());
		//再次遍历数据看看效果
		for(String string : set) {
			System.out.println(string);
		}
	}
}

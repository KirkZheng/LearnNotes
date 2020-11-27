package kk.com.homework;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
	//用hashSet求两个集合 的子集
	public static void main(String[] args) {
		//首先用HashSet创建两个集合
		Set<String>set1=new HashSet<String>();
		set1.add("你好");
		set1.add("你不好");
		Set<String>set2=new HashSet<String>();
		set2.add("你好");
		set2.add("你有点不好");
		//创建第三个集合用来储存子集
		Set<String>set3=new HashSet<String>();
		for(String s:set1) {
			if(set2.contains(s)) {
				set3.add(s);
			}
		}
		System.out.println(set3);
	}
}

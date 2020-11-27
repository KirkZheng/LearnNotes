package kk.com.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 1.从键盘获取一行输入字符串，要求去除重复字符。
2.重写对象Student的hashCode和equals方法,保证在set中能正确判断是否重复
3.hashSet求两个集合的交集 
@author kz96
 * 
 */
public class TestSet {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("------去除重复的字符----\n请输入一个字符串");
		String x=s.next();
		Set<Character>set=new HashSet<Character>();
		for(Character character:x.toCharArray()) {
			set.add(character);
		}
		System.out.println(set);
		}
	
}

package kk.com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map
key:	value:
tom	CoreJava
John	Oracle
Susan	Oracle
Jerry	JDBC
Jim	Unix
Kevin	JSP
Lucy	JSP

1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述 课程安排。 
2） 增加了一位新老师Allen 教JDBC 
3） Lucy 改为教CoreJava   
4） 遍历Map，输出所有的老师及老师教授的课程(Set<Map.Entry<String,String>>、Set<String> get(key)) 
5） 利用Map，输出所有教JSP 的老师
 * 
 * 
 * @author kz96
 * 
 */
public class Teacher {
	public static void main(String[] args) {
		Map<String,String> maps=new HashMap<String,String>();
		maps.put("Tom","CoreJava");
		maps.put("John","Oracle");
		maps.put("Susan","Oracle");
		maps.put("Jerry","JDBC");
		maps.put("Jim","Unix");
		maps.put("Kevin","JSP");
		maps.put("Lucy","JSP");
		
		//增加一位老师Allen教JDBC
		maps.put("Allen","JDBC");
		//增加一位同样教JSP的老师
		maps.put("Bob","JSP");
		maps.put("Lucy","CoraJava");
		
		System.out.println("==================");
		//遍历
		Set<Entry<String,String>> err=maps.entrySet();
		for(Entry<String,String>err2:err) {
			System.out.println(err2.getKey()+"老师教"+err2.getValue());
		}
		System.out.println("===================");
		Set<Entry<String,String>>err3=maps.entrySet();
		System.out.println("教JSP的老师有：");
		for(Entry<String,String>err4:err3) {
			if(err4.getValue().equals("JSP")) {
				System.out.println(err4.getKey());
			}
			
		}
	}
}

package kk.com.homework;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class SetTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//ctrl +shift +o 
		Collection con = new ArrayList();
		con.add("javase");
		con.add("javaee");
		con.add("javame");
		
		Collection con2 = new ArrayList();
		con2.add("html5");
		con2.add("css3");
		con2.add("js");
		
		Iterator it= con.iterator();
		while (it.hasNext()) {
			//只写一个next()
			Object obj = it.next();
			String str = (String)obj;
			System.out.println(str);
		}
		
//		//把一个集合的数据全部加入到另一个集合当中
//		//con.addAll(con2); 把con2集合数据加入到con当中
//		con.addAll(con2);
//		System.out.println(con.size());
//		System.out.println(con2.size());
//		//遍历
//		System.out.println("==========================");
//		
//		Collection con3 = new ArrayList();
//		con3.add("javame");
//		con3.add("html5");
//		con3.add("css");
//		//con.removeAll(con3); 删除con集合 和con3集合有重复的值,删除调用放,con的数据
//		con.removeAll(con3);
//		System.out.println("====================");
//		Iterator it2 =  con.iterator();
//		while (it2.hasNext()) {
//			Object obj = it2.next();
//			String str = (String)obj;
//			System.out.println(str);
//		}
//		System.out.println(con3.size());
		
		
		
	}
}
package kk.com.homework;

import java.util.TreeSet;

/*
 * 
 * @author kz96
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//有序方法，但是元素不可重复
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("a");
		System.out.println(ts);
		//从小到大排序
		TreeSet<Integer> ts2=new TreeSet<Integer>();
		ts2.add(3);
		ts2.add(4);
		ts2.add(8);
		ts2.add(7);
		for(Integer integer:ts2) {
			System.out.println(integer);
		}
		//contains判断是否包含某个数据
		System.out.println(ts2.contains(5));
	}
}

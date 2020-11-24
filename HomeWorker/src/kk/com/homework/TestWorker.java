package kk.com.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//使用Collection方法实现

/*
 创建一个 List，在 List 中增加三个工人，Worker 类基本信息如下：
姓名	年龄	工资
张三	18	3000
李四	20	5000
王五	22	10000
1/在李四之前插入一个工人，信息为：姓名：赵六，年龄：24，工资 3300
2/删除 王五的信息
3/利用 for 循环遍历，打印 List 中所有工人的信息
4/利用 for-each 遍历，对 List 中所有的工人调用 work 方法(输出信息xxx在工作有多少钱)。
5/为 Worker 类添加 equals 方法,判断姓名和年龄都一样即为同一人
*
*@author kz96
 */


public class TestWorker {
	public static void main(String[] args) {
		Collection con =new ArrayList();
		Worker w1= new Worker("张三",18,3000);
		Worker w2= new Worker("李四",20,5000);
		Worker w3= new Worker("王五",22,10000);
		con.add(w1);
		con.add(w2);
		con.add(w3);
		//输出数据的长度
		//System.out.println(con.size());
		//遍历数据
		//Iterator it=con.iterator();
		System.out.println("--------原始数据：-------");
		for (Object object : con) {
			Worker w = (Worker) object;
			System.out.println(w);
		}
		
		//删除王五
		con.remove(new Worker("王五",22,10000));
		//增加赵六
		con.add(new Worker("赵六",24,3300));
		
		System.out.println();
		
		System.out.println("--------删除王五，增加赵六之后:-------");
		for (Object object : con) {
			Worker w = (Worker) object;
			System.out.println(w);
		}
		System.out.println();
		System.out.println("---------个人情况：---------");
		for(Object object:con) {
			Worker w=(Worker)object;
			w.work();
		}
		
	}
	
}

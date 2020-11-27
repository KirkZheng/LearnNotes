package kk.com.homework;
import java.util.HashSet;
import java.util.Set;
/*
 * 
 * set的方法的使用
 * @ kz96
 * 
 */


//set方法的使用
public class TestPeople {
	public static void main(String[] args) {
		Set<People> people=new HashSet<People>();
		People p=new People("张三",23);
		People p1=new People("李四",31);
		people.add(p);
		people.add(p1);
		//增加数据
		people.add(new People("王五",34));
		people.remove(p);
		for(People pl:people) {
			System.out.println(pl);
		}
	}
}

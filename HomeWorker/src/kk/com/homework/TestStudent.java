package kk.com.homework;

import java.util.LinkedList;
/*
 * 
 * /**
 * 创建多个Student对象，使用集合LinkedList集合保存，
 * 
 * 进行添加、以下标添加、以下标获取对象并输出，以下标删除，以下标修改值。
 * 
 * 使用addLast/addFirst/removeFirst/removeLast等方法
 * @author kz96
 * 
 */
public class TestStudent {
	public static void main(String[] args) {
		LinkedList<Student> link=new LinkedList<Student>();
		link.add(new Student("张山",34));
		link.add(new Student("李四",32));
		System.out.println("之前的数据："+link);
		//以下标方式添加数据
		link.addFirst(new Student("王五",31));
		System.out.println("增加之后的数据："+link);
		//以下标方式删除数据
		System.out.println("删除下标数据"+link.removeFirst());
		System.out.println("删除之后的数据："+link);
		//以下标方式更新数据
		Student s=new Student();
		s=link.get(1);
		s.setName("赵六");
		s.setAge(23);
		System.out.println("更新后的数据："+link);
	}
}

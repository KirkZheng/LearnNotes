package kk.com.homework;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * 创建多个Student对象，使用集合LinkedList集合保存，
 * 
 * 进行添加、以下标添加、以下标获取对象并输出，以下标删除，以下标修改值。
 * 
 * 使用addLast/addFirst/removeFirst/removeLast等方法
 * @author kz96
 *
 */
public class StudentTest {


	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		// 以下标添加元素
		list.add(0, new Student("张三", 18));
		list.add(1, new Student("李四", 20));
		list.add(2, new Student("王五", 22));
		list.add(3, new Student("赵六", 24));
		// 以下标输出元素
		System.out.println(list.get(1));
		System.out.println("================");
		// 以下标删除
		list.remove(1);
		// 创建student实例
		// 循环遍历输出
		System.out.println("删除后的集合");
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Student stu = new Student();
		// 把需要修改的值赋值给student对象
		stu = list.get(2);
		stu.setName("宇豪");
		stu.setAge(21);
		System.out.println("=================");
		System.out.println(list.get(2));
		System.out.println("==================");
		System.out.println("修改后的集合");
		Iterator<Student> it2 = list.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
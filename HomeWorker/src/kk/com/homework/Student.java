package kk.com.homework;



/*
 * @author kz96
 */
		
		
		
//创建功能类
public class Student {
	private String name;
	private int age;
	//创建构造方法
	//有参构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//无参构造方法
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//创建toString方法
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	//创建equals方法用来比较集合中的参数
	public boolean equals(Object obj) {
		//比较空值以及内存地址
		if(obj==null) {
			return false;
		}
		if(obj==this) {
			return true;
		}
		return false;
	}
	
}

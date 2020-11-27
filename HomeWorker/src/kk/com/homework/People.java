package kk.com.homework;
/*
 * @author kz96
 */
public class People {
	private String name;
	private int age;
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
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public People() {
		super();
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	public int hashCode() {
		//之前是使用内存地址进行hash计算
		//修改为使用类中属性的值进行hash计算
		int i = this.getName().hashCode();//名字相同
		return i;//相加得出的hash值相同
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof People) {
			People p=(People)obj;
			if(this.age==p.getAge()&&this.name==p.getName()) {
				return true;
			}
		}
		return false;
	}	
	
}

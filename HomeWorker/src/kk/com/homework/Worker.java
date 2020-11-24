package kk.com.homework;

/*
 * @author kz96
 */




public class Worker {
	private String name;
	private int age;
	private int money;
	//创建work方法
	public void work() {
		System.out.println(this.name+this.age+"岁"+"一个月"+this.money+"块");
	}
	//创建有参构造方法
	public Worker(String name,int age,int money) {
		super();
		this.age=age;
		this.money=money;
		this.name=name;
	}
	//创建无参构造方法
	public Worker() {
		
	}
	
	//创建getset方法
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//创建toString方法
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", money=" + money + "]";
	}
	
	//添加 equals 方法,判断姓名和年龄都一样即为同一人，否则无法删除
		public boolean equals(Object obj) {
			//判断是否为空
			if(obj==null) {
				return false;
			}
			//判断内存地址时候相同
			if(this==obj) {
				return true;
			}
			//判断是否为Worker类型
			if(obj instanceof Worker) {
				Worker w=(Worker)obj;
				if(this.name==w.getName()&&this.age==w.getAge()) {
					return true;
				}
			}
			return false;
		}
	
	
	
	
	
	
}

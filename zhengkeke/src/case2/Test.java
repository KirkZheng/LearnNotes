package case2;

public class Test {
	public static void main(String[] args) {
		//使用多态，子类继承父类的属性
		Animal e=new Fish();
		Animal c=new Bird();
		//拆箱，子类调用父类的属性
		Fish f=(Fish)e;
		Bird b=(Bird)c;
		System.out.println("鸟在"+e.huxi+"...");
		System.out.println("鱼在"+b.huxi+"...");
		//输出鱼和鸟的方法
		b.fly();
		f.swim();	
	}
}

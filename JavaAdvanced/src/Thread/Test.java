package Thread;

public class Test {
	public static void main(String[] args) {
		//创建子线程，调用子线程对象
		FirstThread ft=new FirstThread();
		//启动线程
		ft.start();
		//调用子类方法
	}
}

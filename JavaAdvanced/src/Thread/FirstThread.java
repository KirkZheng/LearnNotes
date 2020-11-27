package Thread;
/*
 * 继承线程
 * 
 */
public class FirstThread extends Thread{
	

	//创建线程方法
	public void run() {
		//输出线程名字和线程ID
		for(int i=0;i<10;i++) {
		System.out.println("线程ID是："+Thread.currentThread().getId()+"线程名字是："+Thread.currentThread().getName()+i);
		}
	}
	public FirstThread() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public FirstThread(String name) {
		super(name);
	}
}

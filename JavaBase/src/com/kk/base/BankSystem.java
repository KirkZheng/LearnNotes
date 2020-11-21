package com.kk.base;
import java.util.Scanner;//导包

/**
@author kz96
 */

public class BankSystem {

	public static void main(String[] args) {
		//模拟银行取款
		/**
		 * 需求：
		 * 1.用户需要输入19位数字账户和6位数字密码
		 * 2.只有3次机会，每输错1次提示剩余机会
		 * 3.输入正确以后再输入取款金额
		 * 4.输入取款金额不能小于0，否则报错
		 * 5.取款金额需小于余额，取款完毕更新余额。
		 * 6.取款金额大于或等于余额时提示“余额不足”
		 * 7.初始金额5000，账户余额不能小于1元
		 * 8.记录取款次数，循环提示取钱，直到余额等于1
		 */
		String zh="1";
		String mm="1";
		String i;
		String j;
		int count=3;
		//定义计数器并赋值3，记录输入账号密码的次数，3次
		int count2=0;
		//定义计数器2，记录取钱的次数
		int yu=5000;
		//定义一个初始余额
		System.out.println("\n"+"\n");
		System.out.println("\t"+"--------------欢迎来到XX银行------------"+"\n");
		
		
		//登录模块
		do{ 
			Scanner sc=new Scanner(System.in);
			//提示用户键盘输入
			System.out.println("请输入你的账号：");
		    i=sc.next();
		    System.out.println("请输入你的密码：");
		    j=sc.next();
		    if(!i.equals(zh) || !j.equals(mm)) {
		    	//匹配账号密码是否正确
		    	count--;
		    	//输错账号密码一次就减一次输入的机会
		    	if(count==0) {
		    		//如果超过三次就锁定账号
		    		System.out.println("\n"+"\n"+"\n");
		    		System.out.println("\t"+"-------------------账户被锁定！！！--------------------");
		    		System.out.println("\t"+"-------------------账户被锁定！！！--------------------");
		    		System.out.println("\t"+"-------------------账户被锁定！！！--------------------");
		    		break;
		    	}
		    	System.out.println("账号密码输入错误！！！请重新输入："+"\n");
		    	System.out.println("------------你还有"+count+"次机会！--------");
		    	System.out.println("\n"+"\n");
		    	
		    	
		    	
		    	//登陆成功后关于取钱的功能模块
		    }else {
		    	System.out.println("登录成功！你的账户共有5000元，账户需要保留1元钱。"+"\n");
		    	for(;;) {//初始化取钱次数100次
		    		System.out.println("请输入取款金额：");
		    		int qk=sc.nextInt();
		    		/*如果用户输入的不是数字，会抛出异常
		    		 * 如何满足如果出现异常，提示用户重新输入数字这个需求？？？
		    		*/
		    		count2++;//记录每次取钱的次数
		    		int x=yu-qk;
		    	if(yu==0){
			    	System.out.println("你已破产！！！");
			    	break;
			    }if(qk<0) {
		    		//取款金额不能小于0元
		    		System.out.println("输入有误，取款金额不能小于0！");
		    		continue;
		    	}if(qk>x && x<1) {
		    		//取款不能大于余额
		    		System.out.println("余额不足！请重新输入：");
		    	}else {
		    		yu=yu-qk;
		    		//余额等于现有余额减去每次取钱数
		    		System.out.println("你的账户还有"+yu+"元");
		    		System.out.println("第"+count2+"次取款"+"\n");
		    		//输出取款次数
		    		continue;//只要还有余额，就继续提示进行取款
		    		}
		    	}
		    }
		}while(!i.equals(zh) || !j.equals(mm));
		//匹配用户输入的字符是否与默认的字符匹配
	}

}

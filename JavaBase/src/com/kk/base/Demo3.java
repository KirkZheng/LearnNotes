package com.kk.base;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
//		第一题：输入张三的Java成绩,大于80分，全部鼓掌
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入张三的成绩：");
//		int score=sc.nextInt();
//		if(score>80) {
//			System.out.println("鼓掌！");
//		}
//		System.out.println("程序终止！！！");
		
		
		
		
		
		
		
		
		

//		第二题：输入张三的Java和php成绩,都大于80分，全班鼓掌，否则鼓励
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入张三java的成绩：");
//		int javascore=sc.nextInt();
//		System.out.println("请输入张三php的成绩：");
//		int phpscore=sc.nextInt();
//		if(javascore>80 && phpscore>80) {
//			System.out.println("全部鼓掌！！！");
//		}else {
//			System.out.println("鼓励！");
//		}
		
		
		
		
		
		
		
		
		
//		第三题：score = 70;
//		考试成绩评测，大于等于80分良好，大于等于60分并小于80分中等，小于60分多加努力
//		int score=70;
//		if(score>=80) {
//			System.out.println("良好！");
//		}else if(score>=60 && score<80) {
//			System.out.println("中等！");
//		}else {
//			System.out.println("多加努力！！！");
//		}
		
		
		
		
		
		
		
		
			
//		第四题：嵌套if，运动会百米赛跑，用时10秒之内的人进入总决赛，否则淘汰，进入总决赛后分男，女赛，输出进入的是男子组决赛还是女子组决赛
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入你的成绩（秒）：");
//		Double score=sc.nextDouble();
//		if(score<10.00 && score>0.00) {
//			System.out.println("恭喜进入总决赛！");
//			System.out.println("请输入你的性别：");
//			String sex=sc.next();
//			if(sex.equals("男")) {
//				System.out.println("进入男子组决赛！");
//			}else {
//				System.out.println("进入女子组决赛！");
//			}
//		}else {
//			System.out.println("淘汰！");
//		}
		
		
		
		
		
		
		
		
//第五题：	输入会员 积分及购物金额，根据积分的不同享受不同的折扣，并输出结账金额
//		x ＜ 2000		9折  
//		2000 ≤ x ＜ 4000	8折
//		4000 ≤ x ＜ 8000	7折
//		x ≥ 8000	6折			
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入你的会员积分：");
//		int jifen=sc.nextInt();
//		System.out.println("请输入你的购物金额：");
//		double money=sc.nextDouble();
//		if(jifen<2000) {
//			System.out.println(money*0.9);
//		}else if(jifen>=2000 && jifen<4000) {
//			System.out.println(money*0.8);
//		}else if(jifen>=4000 && jifen <8000) {
//			System.out.println(money*0.7);
//		}else {
//			System.out.println(money*0.6);
//		}
//		
		
		
		
		
		
		
		
		
		
//		第六题：输入月份数字，输出属于哪个季度(春夏秋冬)	
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month=sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("春季");
			break;
		case 2:
			System.out.println("春季");
			break;
		case 3:
			System.out.println("春季");
			break;
		case 4:
			System.out.println("夏季");
			break;
		case 5:
			System.out.println("夏季");
			break;
		case 6:
			System.out.println("夏季");
			break;
		case 7:
			System.out.println("秋季");
			break;
		case 8:
			System.out.println("秋季");
			break;
		case 9:
			System.out.println("秋季");
			break;
		case 10:
			System.out.println("冬季");
			break;
		case 11:
			System.out.println("冬季");
			break;
		case 12:
			System.out.println("冬季");	
			break;
			default:
				System.out.println("输入错误！请输入1-12的数字");
		}
		
	}

}

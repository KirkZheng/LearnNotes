package com.kk.homework;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10)+1;
        int count=1;
        while (true){
            //键盘录入要猜的数
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数：");
            int guessNum = sc.nextInt();
            // 比较数据
            if (guessNum > num){
                System.out.println("猜大了");
            }else if (guessNum < num){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                break;
            }
            count++;
        }
        System.out.println("==================");
        System.out.println("共猜了"+count+"次");
    }

}
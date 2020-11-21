package com.kk.base;
import java.util.Random;
import java.util.Scanner;

/**
 * 猜拳 死循环
 * 随机 1-3 1石头 2剪刀 3布。
 *  用户输入1-3 1石头 2剪刀 3布 进行比对 。
 */
public class GuessHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("------请输入数字1或者2或者3-----");
            int n = input.nextInt();
            Random ran = new Random();
            int m = ran.nextInt(4) + 1;
            // 调用方法t1
            String s = t1(n, m);
            // 判断是否赢了，来结束游戏
            if (s.equals("1")) {
                System.out.println("游戏结束！");
                break;
            }

        }

    }

    // 方法t1来判断游戏输赢
    public static String t1(int n, int m) {

        if ((n == 1 && m == 2) || (n == 2 && m == 3) || (n == 3 && m == 1)) {
            System.out.println("赢");
            return "1";
        } else if (n == m) {
            System.out.println("平局");
            return "0";
        } else {
            return "0";
        }

    }

    // 输入123，输出石头剪刀布，否则其他的就输入错误
    public static String t2(int n) {
        switch (n) {
            case 1:
                return "石头";
            case 2:
                return "剪刀";
            case 3:
                return "布";
            default:
                return "输入错误";
        }

    }
}

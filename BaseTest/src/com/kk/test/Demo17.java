package com.kk.test;

import java.util.Scanner;

public class Demo17 {
    //5、1个班5人java成绩，创建方法，参数为数组，计算平均分，然后所有学员50分以下+10分，50分以上的加5分，并将结果数组返回，接受后输出
    public static void main(String[] args) {
        fangfa();
    }
        public static void fangfa(){
            int[] score = {23, 45, 56, 34, 67};
            int sum = 0;
            System.out.println("加完以后的值：");
            for (int i = 0; i < score.length; i++) {

                sum = sum + score[i];

                if (score[i] < 50) {
                    //小于50的加10
                    System.out.println(score[i] + 10);
                } else {
                    //大于50的加5
                    System.out.println(score[i] + 5);
                }
            }
            System.out.print("平均数是：" + sum / score.length);
        }
    }

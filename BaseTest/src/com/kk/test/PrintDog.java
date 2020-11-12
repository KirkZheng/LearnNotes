package com.kk.test;

public class PrintDog {
    public static void main (String args[]){
        Dog dog = new Dog();
        dog.name="大黄";
        dog.color="黑色";
        System.out.println("小狗的名字是："+dog.name+"年龄是："+dog.age+"颜色是："+dog.color);

        dog.eat();
        dog.sleep();
       
    }

}
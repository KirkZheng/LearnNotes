package com.kk.test;

import java.util.HashMap;
import java.util.Map;

/*
 * 1.JAVA编程题:字符串"yekmaakkccekymbvb",
 * 求出字符串中有多少种字符,以及每个字符的个数，请使用集合进行操作（20分）
 *@author kz96
 */



public class Test {
    public static void main(String args[]) {
      String string="yekmaakkccekymbvb";
       Map<Character,Integer> map=new HashMap<>();
       for(int i=1;i<string.length();i++) {
    	   //求出数组的长度
    	   char c=string.charAt(i);
    	   //遍历数组，并求出每种字符
    	   if(map.containsKey(c)){
    		   Integer count=map.get(c);
    		   map.put(c,++count);
    	   }else {
    		   map.put(c,1);
    	   }
       }
       System.out.println(map);
    }

	
}
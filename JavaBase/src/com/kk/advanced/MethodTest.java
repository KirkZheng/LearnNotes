package com.kk.advanced;

public class MethodTest {
	public static void main(String[] args) {
		String a="hello";
		//判断字符里面有没有指定的字符
		System.out.println(a.contains("e"));
		//去除前后空格
		System.out.println("   ha ha    ".trim());
		//将小写全部变成大写
		String b="hello";
		String c=b.toUpperCase();
		System.out.println(c);
		//截取字符串
		int index=c.indexOf("LLO");
		System.out.println(c.substring(index));
		//将段落分割
		String d="床前明月光，疑是地上霜。举头望明月，低头思故乡。";
		
	}
}

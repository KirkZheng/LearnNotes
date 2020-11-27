package kk.com.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 辽宁省、吉林省、黑龙江省、广东省
辽宁省、
沈阳、大连、鞍山、抚顺、本溪、丹东、锦州、营口,阜新
吉林省
吉林市、四平市、通化市、白山市、辽源市、白城市
黑龙江省
哈尔滨市,齐齐哈尔市,鸡西市,鹤岗市,双鸭山市,大庆市
广东省
广州，深圳，珠海，东莞，佛山，中山，惠州

要求使用键盘输入 省得到所有市
展示所有省
输入省的名称,得到所有的市
@author kz96
 */
public class TestMap {
	public static void main(String[] args) {
		//创建集合存储每个省份中的市
		ArrayList<String> list=new ArrayList<String>();
		//存入各个省的数据
		//辽宁
		list.add("沈阳市");
		list.add("大连市");
		list.add("鞍山市");
		list.add("抚顺市");
		list.add("本溪市");
		list.add("丹东市");
		list.add("锦州市");
		list.add("营口市");
		list.add("阜新市");
		//吉林省
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("吉林市");
		list2.add("四平市");
		list2.add("通化市");
		list2.add("白山市");
		list2.add("辽源市");
		list2.add("白城市");
		//黑龙江省
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("哈尔滨市");
		list3.add("齐齐哈尔市");
		list3.add("鸡西市");
		list3.add("鹤岗市");
		list3.add("双鸭山市");
		list3.add("大庆市");
		//广东省
		ArrayList<String> list4=new ArrayList<String>();
		list4.add("广州市");
		list4.add("深圳市");
		list4.add("珠海市");
		list4.add("东莞市");
		list4.add("佛山市");
		list4.add("中山市");
		list4.add("惠州市");
		//创建Map集合
		Map<String,List<String>>maps=new HashMap<String,List<String>>();
		maps.put("辽宁省",list);
		maps.put("吉林省",list2);
		maps.put("黑龙江省",list3);
		maps.put("广东省",list4);
		
		//创建键盘接受对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的省份（辽宁、吉林、黑龙江、广东）:");
		while(true) {
		String s=sc.next();
		
		boolean b=false;
		
		//创建增强for遍历
		Set<Entry<String,List<String>>> err=maps.entrySet();
			for(Entry<String, List<String>> err2:err) {	
				if(err2.getKey().equals(s)) {
					System.out.println(err2.getKey()+":"+err2.getValue());
					b=true;
				}		
		}
			if(b==false) {
				System.out.println("输入错误！请输入你的省份（辽宁、吉林、黑龙江、广东）:");
			}
		}
	}
}

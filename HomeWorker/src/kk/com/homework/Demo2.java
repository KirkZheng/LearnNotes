package kk.com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo2 {
	public static void main(String[] args) {
		//tree会直接从小到大排序
		//hash没有顺序
		Map<String ,String>maps=new TreeMap<String,String>();
		maps.put("google","谷歌");
		maps.put("baidu","百度");
		maps.put("yahoo","雅虎");
		maps.put("bing","必应");
		//获取数据
		maps.get("google");
		maps.get("baidu");
		maps.get("yahoo");
		maps.get("bing");
		
		Set<String> key=maps.keySet();
		//遍历数据
		for(String str:key) {
			System.out.println(str+maps.get(str));
		}	
		maps.remove("baidu");
		//value值可以覆盖，key值不可覆盖
		maps.put("google","测试这个空值");
		System.out.println(maps);
	}
}

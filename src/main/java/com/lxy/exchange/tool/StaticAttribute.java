package com.lxy.exchange.tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticAttribute {
	
	private static List<String> type= Arrays.asList("角色","场景","插画");
	public static final List<Map<String,String>> TYPELIST = new ArrayList<Map<String,String>>();
	
	private static List<String> patten= Arrays.asList("RGB","CMYK","HSB");
	public static final List<Map<String,String>> PATTENLIST = new ArrayList<Map<String,String>>();
	
	private static List<String> format= Arrays.asList("JPG","PNG");
	public static final List<Map<String,String>> FORMATLIST = new ArrayList<Map<String,String>>();
	
	static {
		for(int i=0;i<type.size();i++) {
			Map<String,String> map=new HashMap<String,String>();
			map.put("typeid", String.valueOf(i+2));
			map.put("typename", type.get(i));
			TYPELIST.add(map);
		}
		Map<String,String> tmp=new HashMap<String,String>();
		tmp.put("typeid", "1");
		tmp.put("typename", "其它");
		TYPELIST.add(tmp);
		
		for(int i=0;i<format.size();i++) {
			Map<String,String> map=new HashMap<String,String>();
			map.put("formatid", String.valueOf(i+2));
			map.put("formatname", format.get(i));
			FORMATLIST.add(map);
		}
		for(int i=0;i<patten.size();i++) {
			Map<String,String> map=new HashMap<String,String>();
			map.put("pattenid", String.valueOf(i+2));
			map.put("pattenname", patten.get(i));
			PATTENLIST.add(map);
		}
	}
	
}

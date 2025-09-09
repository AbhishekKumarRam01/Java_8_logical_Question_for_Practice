package com.abhi.iMoch;

import java.util.LinkedHashMap;
import java.util.Map;

public class WithoutStream {
	public static Character Unique(String str) {
		if(str==null || str.isEmpty()) {
			return null;
		}
	LinkedHashMap<Character,Integer> map = new 	LinkedHashMap<>();
	
	for(char c:str.toCharArray()) {
		map.put(c, map.getOrDefault(c, 0)+1);
		
	}
	for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		if(entry.getValue()==1) {
			return entry.getKey();
		}
		
	}
		return null;
	}
	public static void main(String[] args) {
		String str="swiss";
		Character c=Unique(str);
		System.out.println(c);
		}

}

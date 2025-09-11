package com.abhi.iMoch;

import java.util.stream.IntStream;

public class Pig_latinArray {
	public static boolean Chackt(char c) {
		return "aiuoeAIUOE".indexOf(c)!=-1;
		
	}
	public static String printPig(String str) {
		if(str==null || str.isEmpty())return str;
		int index = IntStream.range(0, str.length())
		.filter(i->Chackt(str.charAt(i)))
		.findFirst()
		.orElse(-1);
		if(index>0) {
			String suffix = str.substring(0, index);
			String prefix = str.substring(index);
			return prefix+suffix+"ay";
		}else{
		return str+"ay";
	}}
	public static void main(String[] args) {
		String str[]= {"Abhishek","Kumar","Sakshi","Mishra","Ajeet","Vijay","Abhijit","Saurabh","Srivastav"};
		for(String s:str) {
			System.out.println(s+"   => "+ printPig(s));
		}
		
	}

}

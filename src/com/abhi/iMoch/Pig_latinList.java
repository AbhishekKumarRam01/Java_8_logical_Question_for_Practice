package com.abhi.iMoch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Pig_latinList {
	public static boolean checkt(char c) {
		return "auioeAEOUI".indexOf(c) != -1;
	}

	public static String printLatin(String word) {
		if (word == null || word.isEmpty())
			return word;
		int index = IntStream.range(0, word.length()).filter(i -> checkt(word.charAt(i))).findFirst().orElse(-1);
		if(index>0) {
			String suffix = word.substring(0, index);
			String prefix = word.substring(index);
			return prefix+suffix+"ay";
		}else
		{
			return word+"ay";
		}
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Cheese", "Abhishek", "Sakshi", "Vipul", "Kumar");
		list.forEach(e->System.out.println(e+" =>   "+printLatin(e)));
		
	}

}

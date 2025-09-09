package com.abhi.it3;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharInString {
public static void main(String[] args) {
	String str="Abhishek";
	Map<Character, Long> collect = str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	Set<Entry<Character, Long>> entrySet = collect.entrySet();
	for(Entry<Character,Long> et:entrySet) {
System.out.println(et.getKey()+" "+et.getValue());		
	}
}
}


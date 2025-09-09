package com.abhi.it3;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofWordinString {
public static void main(String[] args) {
	String str="I love You my Bro love You to";
	// It is Used occur Word 
	
	Map<String, Long> map = Arrays.stream(str.trim().split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(map);
// It used To occur Character
Map<Character, Long> map2= str.replace(" ", "")
.chars()
.mapToObj(c->(char)c )
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(map2);

}
}

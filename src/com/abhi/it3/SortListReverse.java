package com.abhi.it3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListReverse {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Abhshek","It","Ram nagar","Guddu","Mukesh");
	List<String> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	for(String s:list2) {
		System.out.print(s);
		
		
	}
	System.out.println();
	List<String> list3 = list.stream().map(str->new StringBuffer(str).reverse().toString()).collect(Collectors.toList());
	System.out.println(list3);
}
}

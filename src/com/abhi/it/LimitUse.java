package com.abhi.it;

import java.util.Arrays;
import java.util.List;

public class LimitUse {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abhishek Kumuar","Rahul Jha","Avneet Kumar","Deepak Gurjar","Sumit Kumar","Sachin");
		list.stream().limit(2).forEach(System.out::println);
	}

}

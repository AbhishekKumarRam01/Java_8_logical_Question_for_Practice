package com.abhi.it;

import java.util.Arrays;
import java.util.List;

public class UseSkip {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sanjeev","Ajeet","Abhishek","sakshi","Sajjan","Sumit","Sachin","Sandeep","Ajay");
		list.stream().skip(2).forEach(System.out::println);
	}

}

package com.abhi.it;

import java.util.Arrays;
import java.util.List;

public class DistinctUse {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Abhishek","Sakshi","Abhishek","Sakshi","Abhishek","Sakshi","Abhishek","Sakshi","Abhishek","Sakshi","Abhishek","Sakshi"
			,"Abhishek","Sakshi");
	list.stream().distinct().forEach(System.out::println);
}
}

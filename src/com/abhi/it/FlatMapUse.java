package com.abhi.it;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapUse {
	public static void main(String[] args) {
		
		//FlatMap Use For Add .it deal with SubColllection 
		List<String> list = Arrays.asList("java", "html", "css", "java Script", "Bootrap", "Python", "C", "C++", "C#",
				"Ruby", "Php", "Ruby", "Awap");
		List<String> list2 = Arrays.asList("core java", "java backend", "front-end", "UI", "AWS", "micro-services",
				"kafka", "redish", "jira", "Dockur", "Kubernet");
		List<List<String>> list3 = Arrays.asList(list, list2);
		System.out.println(list3);
		Stream<String> map = list3.stream().flatMap(e -> e.stream());
		map.forEach(e -> System.out.println(e));
	}

}

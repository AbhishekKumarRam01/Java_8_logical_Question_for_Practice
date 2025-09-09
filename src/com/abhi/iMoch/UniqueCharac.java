package com.abhi.iMoch;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharac {
	public static Character Uniq(String str) {
		if (str == null || str.isEmpty()) {
			return null;
		}

		return str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findAny().orElse(null);

	}

	public static void main(String[] args) {
		String str = "swiss";
		Character c = Uniq(str);
		if(c!=null) {
			System.out.println(c);
		}

	}

}

package com.jtc.p1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class FunctionUse {
	public static void main(String[] args) {
		Function<String, Integer> f = (name) -> name.length();
		Integer apply = f.apply("Abhishek");
		// System.out.println(apply);
		// find First unique in string

		Function<String, Character> f1 = (name) -> {
			Map<Character, Integer> map = new LinkedHashMap();
			for (char c : name.toLowerCase().toCharArray()) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
			System.out.println(map);
			int count = 0;
			for (Entry<Character, Integer> entry : map.entrySet()) {
				// sirf unique check karna

				if (entry.getValue() == 1) {  

					count++;
					if (count == 2) {

						return entry.getKey();
					}
				}
			}

			return null;
		};

		Character apply2 = f1.apply("Abhisheka");
		if (apply2 != null) {
			System.out.println(apply2);
		} else {
			System.out.println("Not unique in which");
		}
	}

}

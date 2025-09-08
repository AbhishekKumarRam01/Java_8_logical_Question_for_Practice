package com.abhi.it3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class OddAndEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45,45,2,12,89);
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		Set<Entry<Boolean, List<Integer>>> entrySet = map.entrySet();
		for(Map.Entry<Boolean, List<Integer>> et:entrySet) {
			Boolean key = et.getKey();
			List<Integer> value = et.getValue();
			System.out.println(key+" "+value);
		}
		Map<String, List<Integer>> map2 = list.stream().collect(Collectors.groupingBy(i->i%2==0?"even":"odd"));
		map2.forEach((a,b)->System.out.println(a+" "+b));
	}

}

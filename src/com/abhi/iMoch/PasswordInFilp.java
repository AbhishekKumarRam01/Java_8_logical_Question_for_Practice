package com.abhi.iMoch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PasswordInFilp {
	public static int filpchak(String pwd) {
		int n = pwd.length();
		int flip = IntStream.range(0, n / 2).map(i -> {
			char c1 = pwd.charAt(2 * i);
			char c2 = pwd.charAt(2 * i + 1);
			return (c1 == c2) ? 0 : 1;

		}).sum();
		if (n % 2 != 0) {
			flip += 1;
		}

		return flip;
	}

	public static void main(String[] args) {
		String pwd[] = { "1010", "1100", "10101", "1010001" };
		List<Integer> list = Arrays.stream(pwd).map(PasswordInFilp::filpchak).collect(Collectors.toList());
		System.out.println(list);
		List<String> result = IntStream.range(0, list.size())
				.mapToObj(i -> (i == 0 ? "String-" : "String" + i + "-") + list.get(i)).collect(Collectors.toList());
		
		
		System.out.println(result);
		
		List<String> list2 = IntStream.range(0, pwd.length).
		mapToObj(i-> pwd[i]+" -   "+ filpchak(pwd[i]))
		.collect(Collectors.toList());
		
		System.out.println(list2);
		
		
		//int filpchak = filpchak(pwd);
	// System.out.println(filpchak);
		// IntStream.range(0, pwd.length()).forEach(System.out::print);

	}

}

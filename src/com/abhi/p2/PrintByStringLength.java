package com.abhi.p2;

import java.util.Arrays;
import java.util.Comparator;

public class PrintByStringLength {

	public static void main(String[] args) {
		String ar[] = { "AAA", "AB", "ABC", "BCS", "ABCD", "KCHTS" };
		Arrays.stream(ar).map((a) -> {

			char[] cs = a.toCharArray();
			Arrays.sort(cs);
			return new String(cs);
		}).sorted(Comparator.comparing(String::length)).forEach(System.out::println);

	}
}

package com.abhi.iMoch;

import java.util.stream.IntStream;

public final class Pig_Latin {
	public static boolean checkt(char c) {
		return "auioeAEUOI".indexOf(c) != -1;
	}

	public static String PrintPig_latin(String str) {
		if (str == null || str.isEmpty())
			return str;

		int index = IntStream.range(0, str.length()).filter(i -> checkt(str.charAt(i))).findFirst().orElse(-1);
		if (index == 0) {
			return str + "ay";
		} else if (index > 0) {
			String suffix = str.substring(0, index);
			String prefix = str.substring(index);
			return prefix + suffix + "ay";
		} else {
			return str + "ay";
		}

	}

	public static void main(String[] args) {
		String str = "kumar";
		String latin = PrintPig_latin(str);
		System.out.println(latin);
	}

}

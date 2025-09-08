package com.abhi.p2;

import java.util.StringJoiner;

public class StringJoinerUse {
	public static void main(String[] args) {
		long t1 = System.nanoTime();
	StringJoiner joiner = new 	StringJoiner("-");
	joiner.add("Abhi");
	joiner.add("IT");
	joiner.add("java developer");
	joiner.add("Kmart");
	System.out.println(joiner);
	long t2 = System.nanoTime();
	long time =t2-t1;
	System.out.println(time/1000000+ "  ms Total time For All Execution ");
	StringJoiner j = new StringJoiner(" , ","Mr : ","   Welcome");
	j.add("Amitab Bachhan");
	j.add("Akshay Kumar");
	j.add("Salman Khan");
	j.add("Sharukh Khan ");
	j.add("Sunil Set");
	j.add("Deepak Kumar");
	System.out.print(j);
	}

}

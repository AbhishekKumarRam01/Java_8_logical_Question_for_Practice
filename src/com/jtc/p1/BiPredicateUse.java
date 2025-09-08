package com.jtc.p1;

import java.util.function.BiPredicate;

public class BiPredicateUse {
	public static void main(String[] args) {
		long nanoTime = System.nanoTime();
		//System.out.println(nanoTime);
		BiPredicate<String,String> bp=(str,suffixe)->str.endsWith(suffixe);
		boolean test = bp.test("Mr Abhishek Kumar", "Kumar");
		System.out.println(test);
		 BiPredicate<String, String> bp1=(str,prefix)->str.startsWith("Mr");
		 boolean test2 = bp1.test("Mr Kumar", "Mr");
		
		System.out.println(test2);
		 BiPredicate<String, String> and = bp.and(bp1);
		 boolean test3 = and.test("Mr Abhishek Kumar", "Kumar");
		 System.out.println(test3);
		 long nanoTime1 = System.nanoTime();
			System.out.println("total time "+ (( nanoTime1-nanoTime)/100000)+"ms");
		 
	}

}

package com.abhi.p2;

public class UsingRecurstion {
	public static void main(String[] args) {
		print100(1);
		
	}
	public static void print100(int i) {
		if(i<=100) {
			System.out.print(i+",");
			i++;
			print100(i);
		}
	}

}

package com.abhi.p2;

import java.util.Scanner;

public class Fibbonacci {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Take input for Fibbonacci");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int first=0,second=1;
		for(int i=0;i<=n;i++) {
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
		}
		sc.close();
	
}

}

package com.abhi.p2;

public class RunnableWithLambda {
public static void main(String[] args) {
	Runnable r=()->{
		for(int i=0;i<=100;i++) {
			System.out.println(i*i);
		}
	};
	Thread t=new Thread(r);
	t.start();
}
}

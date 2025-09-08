package com.jtc.p1;

import java.util.function.Supplier;

public class SupplierUse {
	public static void main(String[] args) {

		Supplier<String> sup = () -> {
			String otp = "";
			for (int i = 0; i <= 5; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(sup.get());
	}
}

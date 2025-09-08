package com.abhi.p2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class dateApi {
	public static void main(String[] args) {
		LocalDate max = LocalDate.MAX;
		System.out.println(max);
		LocalDate usaDate = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println(usaDate);
		LocalTime now = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println(now);
		LocalDateTime now2 = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(now2);
		LocalDateTime now3 = LocalDateTime.now();
		System.out.println(now3);
		Period between = Period.between(LocalDate.parse("2000-02-02"), LocalDate.now());
		System.out.println(between);
	}

}

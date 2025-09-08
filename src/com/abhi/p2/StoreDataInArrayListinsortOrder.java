package com.abhi.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StoreDataInArrayListinsortOrder {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(78);
		list.add(90);
		list.add(34);
		list.add(32);
		list.add(67);
		list.add(78);
		list.add(56);
		Collections.sort(list,(i,j)->i>j ? 1:-1);
		System.out.println(list);
		Collections.sort(list,(i,j)->i>j?-1:1);
		System.out.println(list);
		Collections.sort(list,new Sotdfj());
		System.out.println(list);
	}}

	class Sotdfj implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1<o2)
				return -1;
			else
				return 1;
		}

	}


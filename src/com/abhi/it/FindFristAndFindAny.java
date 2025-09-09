package com.abhi.it;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFristAndFindAny {
	public static void main(String[] args) {
		List<Employee12> list = Arrays.asList(new Employee12("Abhishek","India","Mumbai"),new Employee12("Sakshi","India","Gorukhpur"),new Employee12("Rahul","India","Patna"),new Employee12("Pankaj","India","Noida")
				,new Employee12("Sachin","India","Firozabad"));
		Optional<Employee12> first = list.stream().filter(e->e.getCity()=="Mumbai").findAny();
	 if (first.isPresent()) {
		 Employee12 employee12 = first.get();
		 System.out.println(employee12);
	 }
	 Optional<Employee12> optional = list.stream().filter(e->e.getCountry()=="Inida").findAny();
	 if(optional.isPresent()) {
		 System.out.println(optional);
	 }
	 Optional<Employee12> first2 = list.stream().filter(e->e.getCountry()=="Maxico").findFirst();
	 if(first2.isPresent()) {
		 System.out.println(first2);
	 }
	}

}

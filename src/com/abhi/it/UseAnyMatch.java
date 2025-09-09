package com.abhi.it;

import java.util.Arrays;
import java.util.List;

class Employee12{
	private String name;
	private String country;
	private String city;
	public Employee12(String name, String country, String city) {
		super();
		this.name = name;
		this.country = country;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", country=" + country + ", city=" + city + "]";
	}
	
}
public class UseAnyMatch {
public static void main(String[] args) {
	List<Employee12> list = Arrays.asList(new Employee12("Abhishek","India","Agra"),new Employee12("Sumit","India","Delhi"),new Employee12("Rahul","Dubai","Tk"),
			new Employee12("Sakshi","India","Agra"),new Employee12("Dela","USA","Idhaho"),new Employee12("Bharat","Russia","Maxico")
			);
	boolean match = list.stream().anyMatch(e->e.getCity().equals("GorukhPur"));
	System.out.println(match);
	boolean match2 = list.stream().noneMatch(e->e.getCity().equals("Agra"));
	System.out.println(match2);
	boolean match3 = list.stream().allMatch(e->e.getCity().equals("Agra"));
	System.out.println(match3);
	list.stream().filter(e->e.getCity()=="Agra").forEach(System.out::println);
	
}
}

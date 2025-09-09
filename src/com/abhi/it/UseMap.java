package com.abhi.it;
import java.util.Arrays;
import java.util.List;

public class UseMap {
	public static void main(String[] args) {
		
		  List<String> list = Arrays.asList("abhishek", "Karan", "Abhi It", "Sumit",
		  "Sunil", "Sundar", "singh", "Manhotra", "Hariom", "Vivek sir", "Ajeet");
		  list.stream().map(i -> i.toLowerCase()).forEach(System.out::println);
		  list.stream().map(i -> i.toUpperCase()).forEach(System.out::print);
		  list.stream().map(i -> i + "  length   " +
		  i.length()).forEach(System.out::println);
		 
			/*
			 * List<Employee> listal = Arrays.asList(new Employee("Abhi It",
			 * "abhishekonedev01@gmail.com", 26, 43000.00), new Employee("Bharat",
			 * "bharat23@gmail.com", 28, 30000), new Employee("Rohit", "rohiter@gmail.com",
			 * 32, 80000.00), new Employee("Darshan", "chhotu23@gmail.com", 25, 35000), new
			 * Employee("Dharamveer", "dharamveer23@gmail.com", 32, 40000), new
			 * Employee("SaurabhShrivastav","surabhkumar@gmail.com",33,50000.00) ,new
			 * Employee("Karan","karanhj@gmail.com",34,90000.00) ,new
			 * Employee("Rahul","rahulwe@hgmail.com",40,909090.00));
			 * listal.stream().filter(i->i.getSalary()<=50000).map(i->i.getName()+" "+i.
			 * getAge()).forEach(i->System.out.println(i));
			 */

	}

}

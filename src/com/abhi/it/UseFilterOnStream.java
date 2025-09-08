package com.abhi.it;

import java.util.Arrays;
import java.util.List;

class Employee {
	private String name;
	private String email;
	private int age;
	private double salary;

	public Employee(String name, String email, int age, double salary) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class UseFilterOnStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abhi It", "Suresh Sharma", "Bharat Rathor", "Sunil Rathore", "Raj Pratap",
				"Mahesh Thakur", "Ranjan Singh", "Anil Kapoor");
		list.stream().filter(i -> i.startsWith("A")).forEach(System.out::print);
		System.out.println();
		list.stream().filter(i -> i.endsWith("r")).forEach(i -> System.out.print(i));
		System.out.println();
		list.stream().filter(i -> i.equals("Abhi It")).forEach(i -> System.out.print(i));
		List<Employee> list2 = Arrays.asList(new Employee("Abhi It", "abhishekonedev01@gmail.com", 26, 43000.00),
				new Employee("Bharat", "bharat23@gmail.com", 28, 30000),
				new Employee("Rohit", "rohiter@gmail.com", 32, 80000.00),
				new Employee("Darshan", "chhotu23@gmail.com", 25, 35000),
				new Employee("Dharamveer", "dharamveer23@gmail.com", 32, 40000),
				new Employee("SaurabhShrivastav","surabhkumar@gmail.com",33,50000.00)
				,new Employee("Karan","karanhj@gmail.com",34,90000.00)
				,new Employee("Rahul","rahulwe@hgmail.com",40,909090.00));

		System.out.println();
		list2.stream().filter(i -> i.getAge() > 25).forEach(System.out::print);
		System.out.println();
		list2.stream().filter(i -> i.getAge() == 25).forEach(i -> System.out.println(i));
		list2.stream().filter(i -> i.getEmail() == "abhishekonedev01@gmail.com").forEach(System.out::println);
		list2.stream().filter(i -> i.getName().startsWith("B") && i.getEmail() == "bharat23@gmail.com")
				.forEach(i -> System.out.println(i));
	}

}

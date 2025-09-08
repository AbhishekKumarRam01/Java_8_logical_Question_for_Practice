package com.jtc.p1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	private Integer id;
	private String name;
	private Integer age;
	private double salary;

	public Employee(Integer id, String name, Integer age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class PredicateUse {
	public static void main(String[] args) {
		Predicate<Integer> isEven = (a) -> a % 2 == 0;
		boolean b = isEven.test(10);
		//System.out.println(b);
		List<Employee> list = Arrays.asList(new Employee(1, "pankaj", 30, 54000.89),
				new Employee(102, "Abhishek", 27, 5600.100), new Employee(103, "Bharat", 28, 2500.00),
				new Employee(105, "Rohit", 35, 105000));
		Predicate<Employee> em = (emp) -> {
			return emp.getId() >= 10;
		};
		Predicate<Employee> em1 = (emp) -> {
			return emp.getName().startsWith("A");
		};
		Predicate<Employee> and = em.and(em1);
		list.forEach((emp) -> {
			if (and.test(emp)) {
				//System.out.println(emp.getName() + "" + emp.getAge());
			}

		});
		Predicate<Employee> em2 = (emp) -> emp.getSalary() <= 100000;
		Predicate<Employee> em3 = (emp) -> emp.getAge() >= 40;
		Predicate<Employee> em4 = (emp) -> emp.getName().toUpperCase().endsWith("T");
		Predicate<Employee> and2 = em2.or(em4).and(em4);
		list.forEach((emp)->{if(and2.test(emp)) {
		System.out.println(emp.getName());
		System.out.println(emp+"  That Person is age 40+ and salary less 100000 name end with T" );
		}});
	}

}

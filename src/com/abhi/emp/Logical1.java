package com.abhi.emp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private String email;
	private double salary;
	private String country;
	private String department;
	private String gender;
	private int age;
	private LocalDate Doj;

	public Employee(String name, String email, double salary, String country, String department, String gender, int age,
			LocalDate doj) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.country = country;
		this.department = department;
		this.gender = gender;
		this.age = age;
		Doj = doj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDoj() {
		return Doj;
	}

	public void setDoj(LocalDate doj) {
		Doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + ", country=" + country
				+ ", department=" + department + ", gender=" + gender + ", age=" + age + ", Doj=" + Doj + "]";
	}

}

public class Logical1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Abhishek Kumar", "abhishek@example.com", 75000.0, "India", "IT", "Male", 25,
						LocalDate.of(2025, 9, 15)),
				new Employee("Sourabh Patel", "sourabh@example.com", 68000.0, "India", "Finance", "Male", 28,
						LocalDate.of(2024, 6, 10)),
				new Employee("Priya Sharma", "priya@example.com", 82000.0, "India", "HR", "Female", 30,
						LocalDate.of(2023, 3, 20)),
				new Employee("Rahul Verma", "rahul@example.com", 54000.0, "India", "Sales", "Male", 26,
						LocalDate.of(2022, 11, 5)),
				new Employee("Neha Gupta", "neha@example.com", 91000.0, "India", "Marketing", "Female", 32,
						LocalDate.of(2021, 7, 18)),
				new Employee("Aman Singh", "aman@example.com", 60000.0, "India", "Support", "Male", 24,
						LocalDate.of(2023, 8, 9)),
				new Employee("Kritika Joshi", "kritika@example.com", 87000.0, "India", "Design", "Female", 29,
						LocalDate.of(2020, 2, 14)),
				new Employee("Vikram Rao", "vikram@example.com", 72000.0, "India", "IT", "Male", 27,
						LocalDate.of(2024, 4, 30)),
				new Employee("Meena Reddy", "meena@example.com", 64000.0, "India", "Operations", "Female", 31,
						LocalDate.of(2019, 12, 25)),
				new Employee("Ajay Yadav", "ajay@example.com", 55000.0, "India", "Finance", "Male", 23,
						LocalDate.of(2022, 1, 12)),
				new Employee("Simran Kaur", "simran@example.com", 95000.0, "India", "Admin", "Female", 34,
						LocalDate.of(2018, 5, 3)),
				new Employee("Rohit Sharma", "rohit@example.com", 70000.0, "India", "IT", "Male", 28,
						LocalDate.of(2025, 2, 8)),
				new Employee("Sneha Kapoor", "sneha@example.com", 81000.0, "India", "Marketing", "Female", 27,
						LocalDate.of(2023, 10, 19)),
				new Employee("Manish Jain", "manish@example.com", 58000.0, "India", "Sales", "Male", 26,
						LocalDate.of(2021, 6, 11)),
				new Employee("Pooja Nair", "pooja@example.com", 89000.0, "India", "HR", "Female", 33,
						LocalDate.of(2020, 9, 21)),
				new Employee("Arjun Mehta", "arjun@example.com", 76000.0, "India", "Design", "Male", 29,
						LocalDate.of(2019, 4, 7)));

		// How many male and female Employee Are there
		Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(e -> e.getGender()));
		System.out.println(map);
		Map<String, Long> map2 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map2);

		// print the Name of all Department
		List<String> list = employees.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
		System.out.println(list);
		// What is the average age of male and Female employee
		Map<String, Double> map3 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(map3);
		// Get Details of highest paid Employee who have Joined in after 2015
		Optional<Employee> max = employees.stream().filter(e -> e.getDoj().isAfter(LocalDate.of(23, 12, 1)))
				.max(Comparator.comparingDouble(Employee::getSalary));
		if (max.isPresent()) {
			System.out.println(max);
		}
		// Count the Number of Employee By Department wise
		Map<String, Long> map4 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map4);
		// What is the averaging salary of Each department
		Map<String, Double> map5 = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map5);

		// Get Details of youngest Male Employee in the IT Department?
		Optional<Employee> min = employees.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("IT"))
				.min(Comparator.comparing(Employee::getAge));

		if (min.isPresent()) {
			System.out.println(min);
		}
		// Who has the most working experience in the Department
		Optional<Employee> ems = employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getDoj)));
		if (ems.isPresent()) {
			System.out.println(ems);
		}
		// How many male and female employees are there in the Sales OR HR
		Map<String, Long> map6 = employees.stream()
				.filter(e -> e.getDepartment() == "Sales" || e.getDepartment().equals("HR"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map6);

		// What Is the average salary of male and Female
		Map<String, Double> map7 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(map7);
		// List down the names of All Employees in Each department
		Map<String, List<String>> map8 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));

		map8.forEach((e, a) -> System.out.println(e + "      " + a));
		// What is Average salary and Total salary of Whole Department
		Map<String, Double> map9 = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		map9.forEach((e, a) -> System.out.println(e + "       " + a));

		// Separate the Employee who are younger or Equal to 25 years from those
		// employees who are older then 25 years
		Map<Boolean, List<Employee>> map10 = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
		map10.get(true).forEach((e) -> System.out.println(e));
		map10.get(false).forEach((e -> System.out.println(e)));
		// Or
		Map<String, List<Employee>> map11 = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getAge() >= 25 ? "Older 25 or 25" : "Younger 25"));
		System.out.println(map11);
		// who is the Oldest employee in the Department ? What is this age Which
		// departments be Belong to ?
		Optional<Employee> max2 = employees.stream().max(Comparator.comparing(Employee::getAge));
		if (max2.isPresent()) {
			Employee employee = max2.get();
			System.out.println("Name :" + employee.getName() + "   Department :" + employee.getDepartment());
		}

		Optional<Employee> max3 = employees.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(max3);
		Optional<Employee> collect = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		System.out.println(collect);
	}
}

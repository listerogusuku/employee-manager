package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int register = sc.nextInt();
		
		for (int i = 1; i<=register; i++) {
			System.out.println();
			System.out.println("Employee #" + (i) + ": ");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee empregado = new Employee(id, name, salary);
			employee.add(i-1, empregado);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = position(employee, idsalary);

		if (pos == null) {
			System.out.println("This id dows not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.get(pos).increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees: ");

		for (Employee emp : employee) {
			System.out.println(emp);
		}

		sc.close();
		
	}
	
	public static Integer position(List<Employee> employee, int id) {
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}

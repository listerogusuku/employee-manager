package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		
		System.out.println("How many employees will be registered? ");
		int register = sc.nextInt();
		
		for (int i = 1; i<register; i++) {
			System.out.println();
			System.out.println("Employee #" + (i) + ": ");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee empregado = new Employee(name, id, salary);
			employee.add(i-1, empregado);
		}
		System.out.println(employee);
		
	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Ex_148 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de funcionarios: ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println("Outsourced(y/n)?");
			char resp = sc.next().charAt(0);

			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			sc.next();
			System.out.print("Digite as houras trabalhadas: ");
			int hours = sc.nextInt();
			System.out.print("Digite o valor por hora: ");
			double valuePerHour = sc.nextDouble();

			if (resp == 'n') {

				Employee func = new Employee(name, hours, valuePerHour);
				list.add(func);
			}
			if (resp == 'y') {

				System.out.print("Despesas adicionais: ");
				double despesas = sc.nextDouble();

				Employee func1 = new OutsourcedEmployee(name, hours, valuePerHour, despesas);
				list.add(func1);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS");
		for (Employee emp : list) {
			System.out.println(emp.getName() + "- Rs" + emp.payment());
		}

		sc.close();
	}

}

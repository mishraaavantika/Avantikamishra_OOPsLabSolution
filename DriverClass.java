package com.credentials.main;

import java.util.Scanner;
import com.credentials.model.Employee;
import com.credentials.service.*;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = sc.next();

		System.out.println("Enter your last name");
		String lastName = sc.next();
		Employee employee1 = new Employee(firstName, lastName);

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical\n2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int dept = sc.nextInt();
		CredentialsService cr = new CredentialsService();
		switch (dept) {
		case 1:
			cr.showCredentials(employee1, "Technical");
			break;
		case 2:
			cr.showCredentials(employee1, "Admin");
			break;
		case 3:
			cr.showCredentials(employee1, "HumanResource");
			break;
		case 4:
			cr.showCredentials(employee1, "Legal");
			break;
		default:
			System.out.println("Illegal Department");
			break;
		}

		sc.close();

	}
}

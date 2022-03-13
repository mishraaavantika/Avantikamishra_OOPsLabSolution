package com.credentials.service;

import com.credentials.model.Employee;
import java.util.Random;

public class CredentialsService {
	private String generatePassword() {
		Random random = new Random();
		String pass = null;
		for (int i = 0; i < 8; i++)
			pass += (char) random.nextInt(33, 123);
		return pass;
	}

	private String generateEmailAddress(Employee e, String department) {
		return e.getFirstName().toLowerCase() + e.getLastName().toLowerCase() + "@" + department + ".abc.com";
	}

	public void showCredentials(Employee e, String department) {
		System.out.println("Dear " + e.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email        --->" + generateEmailAddress(e, department));
		System.out.println("Password ---> " + generatePassword());

	}
}

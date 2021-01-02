package com.alos.cursojava.aula2;

import java.util.Scanner;

public class ReadScanner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name:");		
		String fullName = scan.nextLine();
		System.out.println("Your full name is: "+ fullName);

		System.out.println("Enter your first name:");
		String firstName = scan.next();
		System.out.println("Your first name is: "+firstName);
		
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		System.out.println("Your age is: "+age);
		
		System.out.println("Enter your heigth:");
		double heigth = scan.nextDouble();
		System.out.println("Your heigth is: "+ heigth);
	}

}

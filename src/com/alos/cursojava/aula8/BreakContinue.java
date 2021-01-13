package com.alos.cursojava.aula8;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with a number");
		int num = scan.nextInt();
		
		System.out.println("Enter with a max length");
		int max = scan.nextInt();
		
		for (int i = num; i<=max; i++) {
			if (i % 7 == 0) {
				System.out.println("i value is: "+ i);
				break;
			}
		}
		
		for (int j = 0; j <=4; j++) {
			label1:{
				label2:{
					label3:{
						if ( j == 1) {
							break label1;
						}
						if (j == 2) {
							break label2;
						}
						if (j == 3) {
							break label3;
						}
						System.out.println("label3");
					}
					System.out.println("label2");
				}
				System.out.println("label1");
			}
			System.out.println(j);
		}

	}
	

}

package com.alos.cursojava.aula4;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Entre com sua idade");		
//		int age = scan.nextInt();
//		
//		if (age >= 18) {
//			System.out.println("É maior de idade");
//		}else {
//			System.out.println("É menor de idade");
//		}
	
		System.out.println("Entre com o valor");
		double value = scan.nextDouble();
		
		if(value<=10) {
			System.out.println("É barato");
		} else if(value > 10 && value < 15) {
			System.out.println("Pedir desconto");
		} else if(value >=15 && value < 17) {
			System.out.println("Pesquisar mais");
		} else {
			System.out.println("É caro");
		}
	}
}

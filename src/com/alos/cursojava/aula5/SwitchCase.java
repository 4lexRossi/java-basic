package com.alos.cursojava.aula5;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o dia da semana (1-7): ");		
		int weekDay = scan.nextInt();
		switch(weekDay) {
			case 1: System.out.println("Domingo");
				break;
			case 2: System.out.println("Segunda");
				break;
			case 3: System.out.println("Terça");
				break;
			case 4: System.out.println("Quarta");
				break;
			case 5: System.out.println("Quinta");
				break;
			case 6: System.out.println("Sexta");
				break;
			case 7: System.out.println("Sábado");
				break;
			default: System.out.println("Dia inválido");
		}	
		switch(weekDay) {			
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: System.out.println("Dia útil");
				break;
			case 1:
			case 7: System.out.println("Final de semana");
				break;
			default: System.out.println("Dia inválido");
		}
				
	}

}

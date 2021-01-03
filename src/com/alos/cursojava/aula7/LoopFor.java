package com.alos.cursojava.aula7;

public class LoopFor {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("valor i = "+ i);
		}
		
		for (int i = 5; i > -1; i--) {
			System.out.println("valor i = "+ i);
		}
		
		for (int i = 0, j = 10; i <= j; i++, j--) {
			System.out.println("valor i = "+ i + "; valor j = "+ j);
		}		
	}

}

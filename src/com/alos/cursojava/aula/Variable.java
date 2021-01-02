package com.alos.cursojava.aula;

public class Variable {

	public static void main(String[] args) {
		int age = 20;
		String name = "Alex";
		String petName = "Nina";
		String noPet = "não tem pet";
		boolean hasPet = false;
	
//		if (petName == "Nina") {
//			hasPet = true;
//		}

		System.out.println("Idade = "+ age);
		System.out.println("Nome = "+ name);
		System.out.println("Tem pet = "+ hasPet);
		if (hasPet == true) {
			System.out.println("Qual o nome? " + petName);			
		} else {
			System.out.println("Qual o nome? " + noPet);
		}
	}
}

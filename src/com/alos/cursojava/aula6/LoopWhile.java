package com.alos.cursojava.aula6;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 1;
		int max = 10;
		
		System.out.println("Counting until "+ max);
		
		while (i < max ) {
			System.out.println("i value "+ i);
			i++;			
		}
		System.out.println("i value "+ i);
		
		do {
			i++;
			System.out.println("i value "+ i);
		} while (i < 15);			
			System.out.println(i + " sorry =/");
			i--;
			System.out.println("i value "+ i + " now its ok =D");
	}

}

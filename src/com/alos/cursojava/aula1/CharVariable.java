package com.alos.cursojava.aula1;

public class CharVariable {

	public static void main(String[] args) {
		char o = 'o';
		char i = 'i';
		char interrogation = 0X003F;
		
		System.out.println(o+i);
		
		System.out.println(""+o+i);
		
		o = 111;
		i = 105;
		
		System.out.println(o+i+interrogation);
		
		System.out.println(""+o+i+interrogation);
	}

}

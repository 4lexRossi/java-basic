package com.alos.cursojava.aula9;

public class Arrays {

	public static void main(String[] args) {
		double tempDay001 = 31.3;
		double tempDay002 = 32;
		double tempDay003 = 33.7;
		double tempDay004 = 34;
		
		double[] temperature = new double[365];
		
		temperature[0] = 31.3;
		temperature[1] = 32;
		temperature[2] = 33.7;
		temperature[3] = 34;
		temperature[4] = 33.1;
		
		System.out.println("position 0: "+ temperature[0]);
		
		System.out.println("size of array: "+ temperature.length);
		
		for (int i = 0; i<temperature.length; i++) {
			System.out.println("day "+ (i+1)+" temperature is: "+ temperature[i]);
		}
		
		for (double temp : temperature) {
			System.out.println(temp);
		}
	}

}

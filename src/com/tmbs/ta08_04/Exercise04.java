package com.tmbs.ta08_04;

public class Exercise04 {

	public static void run() {
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie( "Patria", "HBO");
		Serie serie3 = new Serie( "Narcos", 3 , "Accion ", "Netfix");
		
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
		
	}
}

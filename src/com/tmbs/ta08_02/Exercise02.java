package com.tmbs.ta08_02;

public class Exercise02 {
	
	public static void run() {
		
		hr(); // Un constructor por defecto
		Password pass1 = new Password();
		System.out.println(pass1.toString());
		
		hr(); // Un constructor pasando una longitud que nosotros le pasemos
		Password pass3 = new Password(32);
		System.out.println(pass3.toString());
		
		hr(); // Un constructor pasando una password valida
		Password pass = new Password("1234abcd");
		System.out.println(pass.toString());
		
		hr();  // Un constructor pasando una password no valida 
		Password pass4 = new Password("12345");
		System.out.println(pass4.toString());
		
	}
	
	private static void hr() {
		String c = "---------------------------";
		System.out.println(c);
	}

}

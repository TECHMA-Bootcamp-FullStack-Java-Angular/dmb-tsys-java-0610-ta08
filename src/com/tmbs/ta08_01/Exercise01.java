package com.tmbs.ta08_01;

public class Exercise01 {
	
	public static void run() {
		
		// Instanciamos persona con primer constructor
		Persona persona1 = new Persona();
		System.out.println(persona1);

		// Instanciamos persona con segundo constructor
		Persona persona2 = new Persona("David", 18, "H");
		System.out.println(persona2);

		// Instanciamos persona con tercer constructor  y testamos validador genero
		Persona persona3 = new Persona("Marta", 21, "12345678A", "X", 52, 164);
		System.out.println(persona3);
		
		// Testamos validador DNI
		persona1.setDNI("7822694EE"); 
		System.out.println(persona1);

	}

}

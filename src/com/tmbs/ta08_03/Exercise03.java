package com.tmbs.ta08_03;

public class Exercise03 {
	
	public static void run() {
		
		hr();
		System.out.println( orange("CASO 1: ") + " Uso del constructor por defecto");
		Electrodomestico horno = new Electrodomestico();

		System.out.println(horno);
		
		
		hr();
		System.out.println(orange("CASO 2: ") + " Uso del segundo constructor: ");
		Electrodomestico nevera = new Electrodomestico(85.70,66.6);

		System.out.println(nevera);
	

		hr();
		System.out.println(orange("CASO 3: ") + "Uso del tercer constructor pasamos un color no valido:");
		Electrodomestico tostadora = new Electrodomestico(35.95, "LILA" ,'D',12.500);

		System.out.println(tostadora);
		
		
		hr();
		System.out.println( orange("CASO 4: ") + "Uso el metodo set el ConsumoEnergetico con valor no valido");
		horno.setCosumoEnergetico('z');

		System.out.println(horno); 
		
		

	}
	
	static void hr(){
		String hr="----------------------------------------------------------------------";
		System.out.println(hr);
			
	}
	static void br(){	
		System.out.println("\n");
	}
	
	static String orange(String text) {
		return "\033[33m" +text+ "\u001B[0m";	   
	}

}

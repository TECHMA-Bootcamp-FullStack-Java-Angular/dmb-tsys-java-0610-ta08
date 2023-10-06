package com.tmbs.ta08_01;

import java.util.regex.Pattern;

public class Persona {

	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private int peso;
	private int altura;

	private final String SEX_DEFAULT = "H";

	// Constructores
	public Persona() {
		this.nombre = "unknown";
		this.edad = 0;
		this.sexo = SEX_DEFAULT;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = this.validadorSexo(sexo);
	}

	public Persona(String nombre, int edad, String DNI, String sexo, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.setDNI(DNI);
		this.sexo = this.validadorSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + DNI + ", Sexo: " + sexo + ", Peso: " + peso
				+ ", Altura: " + altura + "\n";
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDNI() {
		return DNI;
	}

	public String getSexo() {
		return sexo;
	}

	public int getPeso() {
		return peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDNI(String dni) {

		this.DNI = validadorDNI(dni);
		;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	// Validador DNI
	public String validadorDNI(String dni) {

		String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";

		if (!Pattern.matches(dniRegexp, dni)) {

			System.err.println("Error, DNI introducido incorrecto. Aplicando null defecto");
			return dni = null;

		} else {
			return dni;
		}

	}

	// Validador SEXSO
	public String validadorSexo(String sexo) {
		sexo = sexo.toUpperCase();
		if (!sexo.equals(SEX_DEFAULT) && !sexo.equals("M")) {
			System.err.println("Error, sexo introducido incorrecto. Aplicando HOMBRE por defecto");
			return SEX_DEFAULT;
		}
		return sexo;
	}

}

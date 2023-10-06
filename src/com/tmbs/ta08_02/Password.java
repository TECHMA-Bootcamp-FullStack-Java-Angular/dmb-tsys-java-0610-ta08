package com.tmbs.ta08_02;

import java.util.UUID;

public class Password {

	private final int LONGITUD = 8;

	private String contraseña;
	private int longitud;

	public Password() {
		this.contraseña = generadorPass(LONGITUD);
		this.longitud = LONGITUD;
	}

	public Password(String contraseña) {
		this.contraseña = validatePass(contraseña);
		this.longitud = LONGITUD;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generadorPass(longitud);
	}

	// Getters
	public String getContraseña() {
		return contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	// Por lógica de negocio esta clase no contiene Setters

	// Funcion para agregar contraseña
	private String validatePass(String pass) {
		if (pass.length() != this.LONGITUD) {

			System.err.println("Password introducida incorrecta\nGENERANDO PASSWORD...");
			return pass = generadorPass(this.LONGITUD);
		}
		return pass;
	}

	private String generadorPass(int n) {
		return UUID.randomUUID().toString().replace("-", "").substring(0, n);
	}

	@Override
	public String toString() {
		return "Password: " + contraseña;

	}

}

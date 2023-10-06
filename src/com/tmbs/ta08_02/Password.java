package com.tmbs.ta08_02;

import java.util.UUID;

public class Password {

	private final int LONGITUD = 8;

	private String contrase�a;
	private int longitud;

	public Password() {
		this.contrase�a = generadorPass(LONGITUD);
		this.longitud = LONGITUD;
	}

	public Password(String contrase�a) {
		this.contrase�a = validatePass(contrase�a);
		this.longitud = LONGITUD;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generadorPass(longitud);
	}

	// Getters
	public String getContrase�a() {
		return contrase�a;
	}

	public int getLongitud() {
		return longitud;
	}

	// Por l�gica de negocio esta clase no contiene Setters

	// Funcion para agregar contrase�a
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
		return "Password: " + contrase�a;

	}

}

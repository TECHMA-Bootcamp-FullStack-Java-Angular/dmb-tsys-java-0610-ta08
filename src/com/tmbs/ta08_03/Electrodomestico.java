package com.tmbs.ta08_03;

public class Electrodomestico {

	// Atributos
	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Por defecto
	private final Character[] NIVELES_CONSUMO = { 'A', 'B', 'C', 'D', 'E', 'F' };
	private final String[] COLORES_DISPONIBLES = { "NEGRO", "BLANCO", "ROJO", "AZUL", "GRIS" };
	private final Character CONSUMO_DEFAULT = 'F';
	private final String COLOR_DEFAULT = "BLANCO";
	private final Double PRECIO_BASE = 100.00;
	private final int PESO_DEFAULT = 5;

	public Electrodomestico() {

		this.precio = PRECIO_BASE;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}

	public Electrodomestico(Double precio, Double peso) {

		this.precio = precio;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = peso;
	}

	public Electrodomestico(Double precio, String color, Character consumoEnergetico, Double peso) {

		this.precio = precio;
		this.color = validarColor(color);
		this.consumoEnergetico = validarConsumo(consumoEnergetico);
		this.peso = peso;
	}

	public Double getPrecioBaseDouble() {
		return precio;
	}

	public void setPrecioBaseDouble(Double precio) {
		this.precio = precio;
	}

	public Double getPesoDouble() {
		return peso;
	}

	public void setPesoDouble(Double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = validarColor(color);
	}

	public Character getCosumoEnergetico() {
		return consumoEnergetico;
	}

	public void setCosumoEnergetico(Character consumo) {
		this.consumoEnergetico = validarConsumo(consumo);

	}

	private Character validarConsumo(Character consumo) {

		consumo = Character.toUpperCase(consumo);

		for (Character NIVEL : NIVELES_CONSUMO) {
			if (NIVEL.equals(consumo)) {
				return consumo;
			}
		}
		System.err.println("Aplicamos consumo energetico por defecto [F]");
		return CONSUMO_DEFAULT;

	}

	private String validarColor(String color) {
		String c = color.toUpperCase();

		for (String COLOR : COLORES_DISPONIBLES) {
			if (COLOR.equals(c)) {
				return color;
			}
		}
		System.err.println("Color no valido, Aplicamos BLANCO como color por defecto");
		return COLOR_DEFAULT;
	}

	@Override
	public String toString() {
		return "Precio: " + precio + ",\t Color: " + color + ",\t ConsumoEnergetico: " + consumoEnergetico
				+ ",\t peso: " + peso;
	}

}

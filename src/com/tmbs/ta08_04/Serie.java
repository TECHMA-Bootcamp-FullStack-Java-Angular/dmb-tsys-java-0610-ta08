package com.tmbs.ta08_04;

public class Serie {

	private String titulo;
	private int numeroTemporadas; // 3
	private boolean entregado; // false
	private String genero;
	private String creador;

	public Serie() {

		this.titulo = null;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = null;
		this.creador = null;

	}

	public Serie(String titulo, String creador) {

		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {

		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return (titulo != null ? "Titulo: " + titulo + ", " : "") + "Numero Temporadas: " + numeroTemporadas
				+ ", Entregado: " + entregado + ", " + (genero != null ? "Genero: " + genero + ", " : "")
				+ (creador != null ? "Creador: " + creador : "");
	}

}

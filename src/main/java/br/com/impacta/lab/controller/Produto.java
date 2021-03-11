package br.com.impacta.lab.controller;

public class Produto {

	private int codigo;
	private String tipo;
	private double valor;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
    this.tipo = tipo;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}

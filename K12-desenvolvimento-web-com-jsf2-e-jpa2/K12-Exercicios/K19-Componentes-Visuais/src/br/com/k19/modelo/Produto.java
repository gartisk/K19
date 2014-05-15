package br.com.k19.modelo;

import java.io.Serializable;

public class Produto implements Serializable  {
	private static final long serialVersionUID = 1687691956519878515L;
	
	private String nome;
	private Double preco;
	private Boolean exibir;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Boolean getExibir() {
		return exibir;
	}
	public void setExibir(Boolean exibir) {
		this.exibir = exibir;
	}
	
}

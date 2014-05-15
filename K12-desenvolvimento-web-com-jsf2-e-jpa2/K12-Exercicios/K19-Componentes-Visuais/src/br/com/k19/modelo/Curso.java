package br.com.k19.modelo;

import java.io.Serializable;

public class Curso implements Serializable {
	private static final long serialVersionUID = 8709113510162236083L;
	
	private String nome;
	private String sigla;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}

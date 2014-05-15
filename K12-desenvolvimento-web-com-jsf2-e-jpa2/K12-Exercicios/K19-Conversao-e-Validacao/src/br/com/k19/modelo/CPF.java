package br.com.k19.modelo;

public class CPF {
	private int numeroDeIdentificao;
	private int primeiroDigitoVerificador;
	private int segundoDigitoVerificador;
	
	public int getNumeroDeIdentificao() {
		return numeroDeIdentificao;
	}
	public void setNumeroDeIdentificao(int numeroDeIdentificao) {
		this.numeroDeIdentificao = numeroDeIdentificao;
	}
	public int getPrimeiroDigitoVerificador() {
		return primeiroDigitoVerificador;
	}
	public void setPrimeiroDigitoVerificador(int primeiroDigitoVerificador) {
		this.primeiroDigitoVerificador = primeiroDigitoVerificador;
	}
	public int getSegundoDigitoVerificador() {
		return segundoDigitoVerificador;
	}
	public void setSegundoDigitoVerificador(int segundoDigitoVerificador) {
		this.segundoDigitoVerificador = segundoDigitoVerificador;
	}
	
	

}

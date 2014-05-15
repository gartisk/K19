package br.com.k19.controle;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorMonetarioBean{
	private int ID;
	private String de;
	private String para;
	private Double valor;
	
	private Double resultado;
	private Map<String,Double> taxas = new LinkedHashMap<String, Double>();
	
	public ConversorMonetarioBean(){
		this.taxas.put("Real", 1.0);
		this.taxas.put("Euro", 2.33);
		this.taxas.put("Peso Argentino", 0.42);
		this.taxas.put("Dolar Americano", 1.84);
	}
	
	public Boolean converte(){
		this.resultado = this.valor * this.taxas.get(this.de) / this.taxas.get(this.para);
		return true;
	}
	
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Map<String, Double> getTaxas() {
		return taxas;
	}

	public void setTaxas(Map<String, Double> taxas) {
		this.taxas = taxas;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}

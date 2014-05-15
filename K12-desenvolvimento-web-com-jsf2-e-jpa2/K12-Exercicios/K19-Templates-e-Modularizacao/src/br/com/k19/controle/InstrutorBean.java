package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.k19.modelo.Instrutor;

@ManagedBean
public class InstrutorBean {
	private List<Instrutor> instrutores = new ArrayList<Instrutor>();
	
	public InstrutorBean(){
		Instrutor instrutor1 = new Instrutor("Joao", "02/02/1990");
		Instrutor instrutor2 = new Instrutor("Maria", "28/08/1995");
		Instrutor instrutor3 = new Instrutor("Pedro", "10/04/1980");
		this.instrutores.add(instrutor1);
		this.instrutores.add(instrutor2);
		this.instrutores.add(instrutor3);
		
	}
	
	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}
	

}

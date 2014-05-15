package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AtendimentoLojaBean {
	private String nome;
	private String email;
	private String telefone;
	private String sexo;
	private List<String> listaSexo;
	private String numeroPedido;
	private String assunto;
	private List<String> listaAssunto;
	private String comentario;
		
	public AtendimentoLojaBean(){
		listaAssunto = new ArrayList<String>();
		listaAssunto.add("Contato");
		listaAssunto.add("Suporte");
		listaAssunto.add("Marketing");
		
		listaSexo = new ArrayList<String>();
		listaSexo.add("Masculino");
		listaSexo.add("Feminino");
	}
	
	public AtendimentoLojaBean( AtendimentoLojaBean atendimento ){
		nome = atendimento.nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<String> getListaSexo() {
		return listaSexo;
	}

	public void setListaSexo(List<String> listaSexo) {
		this.listaSexo = listaSexo;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public List<String> getListaAssunto() {
		return listaAssunto;
	}

	public void setListaAssunto(List<String> listaAssunto) {
		this.listaAssunto = listaAssunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}

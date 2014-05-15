package br.com.k19.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.k19.modelo.Curso;

@ManagedBean
@SessionScoped
public class CursosBean implements Serializable {
	private static final long serialVersionUID = 4397174298214240738L;
	private List<Curso> cursos = new ArrayList<Curso>();
	private Curso curso = new Curso();
	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void adicionaCurso(){
		this.cursos.add( this.curso );
		this.curso = new Curso();
		
	}
	
	public Curso getCurso(){
		return this.curso;
	}
	
}

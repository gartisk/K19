package br.com.k19.converters;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.k19.modelo.CPF;

@FacesConverter(forClass = CPF.class)
public class ConversorDeCPF implements Converter{
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		value = value.trim();
		
		//check de pattern
		if(!Pattern.matches("[0-9]{9}-[0-9]{2}", value) ){
			FacesMessage mensagem = new FacesMessage("Número de CPF Inválido");
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ConverterException(mensagem);
		}
		
		String partesDoCPF[] = value.split("-");
		int numeroDeIdentificao = Integer.parseInt(partesDoCPF[0]);
		int primeiroDigitoVerificador = Integer.parseInt(partesDoCPF[1].substring(0, 1));
		int segundoDigitoVerificador = Integer.parseInt(partesDoCPF[1].substring(1, 2));
		
		CPF cpf = new CPF();
		cpf.setNumeroDeIdentificao(numeroDeIdentificao);
		cpf.setPrimeiroDigitoVerificador(primeiroDigitoVerificador);
		cpf.setSegundoDigitoVerificador(segundoDigitoVerificador);
		
		
		return cpf;
	}
	
	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		CPF cpf = (CPF) value;
		return cpf.getNumeroDeIdentificao()+"-"+cpf.getPrimeiroDigitoVerificador()+cpf.getSegundoDigitoVerificador();
	}
}

package br.com.k19.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.k19.modelo.CPF;

@FacesValidator(value="br.com.k19.validators.ValidadorDeCPF")
public class ValidadorDeCPF implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		CPF cpf = (CPF) value;
		int numeroDeIdentificacao = cpf.getNumeroDeIdentificao();
		int primeiroDeIdentificacao = cpf.getPrimeiroDigitoVerificador();
		int segundoDeIdentificacao = cpf.getSegundoDigitoVerificador();
		
		if(!this.validaCPF(numeroDeIdentificacao, primeiroDeIdentificacao, segundoDeIdentificacao)){
			String numero = numeroDeIdentificacao+"-"+primeiroDeIdentificacao+segundoDeIdentificacao;
			
			FacesMessage mensagem = new FacesMessage("O número "+numero+" não é um CPF válido");
			
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(mensagem);
		}
		
		
		
	}
	
	private boolean validaCPF(int numeroDeIdentificacao,int primeiroDigitoVerificador, int segundoDigitoVerificador){
		long primeiroDigito = this.modulo11((long) numeroDeIdentificacao);
		long segundoDigito = this.modulo11((long) numeroDeIdentificacao*10 + primeiroDigito);
		
		
		return primeiroDigitoVerificador == primeiroDigito && segundoDigitoVerificador == segundoDigito;
	}
	
	private long modulo11(long numero){
		long soma = 0;
		long multiplicador = 2;
		
		while (numero > 0) {
			long digito = numero % 10;
			soma += multiplicador * digito;
			numero /= 10;
			multiplicador++;
		}
		
		long resto = soma % 11;
		if(resto < 2)
			return 0;
		else
			return 11-resto;
	}
	
}

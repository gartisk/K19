package br.com.k19.validators;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="br.com.k19.converters.ValidadorDeData")
public class ValidadorDeData implements Validator{
	
	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		Date dataMin = null;
		Date dataMax = null;
		
		String rawDataMin = (String) component.getAttributes().get("inicio");
		String rawDataMax = (String) component.getAttributes().get("fim");
		
		
		try {
			data = sdf.parse( (String)value );
			dataMin = sdf.parse(rawDataMin);
			dataMax = sdf.parse(rawDataMax);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if( data.before( dataMin ) || data.after(dataMax) ){
			FacesMessage mensagem = new FacesMessage("A data não esta apresenta range correto entre: "+sdf.format(dataMin)+" "+sdf.format(dataMax) );
			mensagem.setSeverity( FacesMessage.SEVERITY_ERROR);
			
			throw new ValidatorException(mensagem);
		}
		
		
	}

}

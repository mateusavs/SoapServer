package fiap.scj.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public class MinhaSaudeImpl {
	
	@WebMethod
	public float calcularImc(
			@XmlElement(name = "altura") float altura, 
			@XmlElement(name = "peso") float peso) {
		return (float) (peso / Math.pow(altura,2));  
	}
	
	public String classificacaoImc(
			@XmlElement(name = "imc") float imc) {
		String classificacao = "Muito abaixo do peso";
		
		if   (imc >= 17 && imc < 18.49) 
			classificacao = "Abaixo do peso";
		else if(imc >= 18.5 && imc < 24.99)
			classificacao = "Peso normal";
		else if(imc >= 25 && imc < 29.99)
			classificacao = "Acima do peso";
		else if(imc >= 30 && imc < 34.99)
			classificacao = "Obesidade";
		else if(imc >= 35 && imc < 39.99)
			classificacao = "Obesidade severa";
		else if(imc >= 40)
			classificacao = "Obesidade morbida";
			
		return classificacao;
	}
	
	
	

}

package fiap.scj.ws.soap;

import javax.xml.ws.Endpoint;

public class Servidor {

	public static void main(String[] args) {
		System.out.println("Rodando Rodando");
		
		MinhaSaudeImpl service = new MinhaSaudeImpl();
		Endpoint.publish("http://localhost:8080/minhasaude", service);
	}
	
}

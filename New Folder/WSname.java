import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "retorno")

public class WSname {
	
	Integer idade = 10;
	
	@WebMethod(operationName ="Info")
	public String func(String nome){
		return "Nome: "+nome+" "+"Idade: "+idade;
	}	
	
	
	
} 

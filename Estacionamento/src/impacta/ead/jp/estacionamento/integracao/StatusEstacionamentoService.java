package impacta.ead.jp.estacionamento.integracao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService //ctrl + shif + o (importa)
@SOAPBinding(style = Style.DOCUMENT) //COMO VAI TRAFEGAR A INFORMAÇÃO (DOCUMENT/RPC)
public interface StatusEstacionamentoService {
	
	@WebMethod
	public StatusBean getStatus();

}

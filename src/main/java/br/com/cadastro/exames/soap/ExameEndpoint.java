package br.com.cadastro.exames.soap;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.cadastro.exames.integration.BuscaExameRequisicao;
import br.com.cadastro.exames.integration.ExameResposta;
import br.com.cadastro.exames.model.Exame;
import br.com.cadastro.exames.service.ExameService;

@Endpoint
public class ExameEndpoint {
	private static final String NAMESPACE_URI = "https://www.integracaoexames.com.br/xml/exame";

	@Autowired
	private ExameService exameService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "BuscaExameRequisicao")
	@ResponsePayload
	public ExameResposta buscaPorId(@RequestPayload BuscaExameRequisicao request) {
		ExameResposta response = new ExameResposta();
		Exame exame = exameService.buscarPorId(request.getId());
		if(exame != null){
			br.com.cadastro.exames.integration.Exame exameIntegration = new br.com.cadastro.exames.integration.Exame();
			BeanUtils.copyProperties(exame, exameIntegration);
			response.setExame(exameIntegration);
		}
		return response;
	}
	
}

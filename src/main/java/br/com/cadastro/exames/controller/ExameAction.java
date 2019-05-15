package br.com.cadastro.exames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import br.com.cadastro.exames.model.Exame;
import br.com.cadastro.exames.service.ExameService;

@Component
public class ExameAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Exame> exames;
	private Exame exame = new Exame();
	private String exameId;
	
	@Autowired
	private ExameService exameService;
	
    public String execute() throws Exception {
		exames = exameService.buscarTodos();
        return SUCCESS;
    }
    
    public String carregarExame() {
    	if(exameId != null) 
    		exame = exameService.buscarPorId(Long.valueOf(exameId));
        return SUCCESS;
    }
    
    public String salvarExame() throws Exception {
    	if(exame.getId() == 0l)
    		exameService.salvar(exame);
    	else
    		exameService.atualizar(exame);
        return SUCCESS;
    }
    
    public String removerExame() {
    	if(exameId != null) 
    		exameService.remover(Long.valueOf(exameId));
        return SUCCESS;
    }

	public List<Exame> getExames() {
		return exames;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public String getExameId() {
		return exameId;
	}

	public void setExameId(String exameId) {
		this.exameId = exameId;
	}

}

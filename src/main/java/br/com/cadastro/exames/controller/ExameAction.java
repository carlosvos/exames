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
	
	@Autowired
	private ExameService exameService;
	
    public String execute() throws Exception {
		exames = exameService.buscarTodos();
        return SUCCESS;
    }

	public List<Exame> getExames() {
		return exames;
	}
    
}

package br.com.cadastro.exames.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.exames.dao.ExameDAO;
import br.com.cadastro.exames.model.Exame;
import br.com.cadastro.exames.service.ExameService;

@Service
public class ExameServiceImpl implements ExameService {

	@Autowired
	private ExameDAO exameDAO;
	
	@Override
	public void salvar(Exame exame) {
		exameDAO.salvar(exame);
	}

	@Override
	public void atualizar(Exame exame) {
		exameDAO.atualizar(exame);
	}

	@Override
	public void remover(long id) {
		exameDAO.remover(id);
	}

	@Override
	public List<Exame> buscarTodos() {
		return exameDAO.buscarTodos();
	}

	@Override
	public Exame buscarPorId(long id) {
		return exameDAO.buscarPorId(id);
	}

	@Override
	public Exame buscarPorCodigo(String codigo) {
		return exameDAO.buscarPorCodigo(codigo);
	}
	
	@Override
	public void insertBatch() {
		exameDAO.insertBatch();
	}

}

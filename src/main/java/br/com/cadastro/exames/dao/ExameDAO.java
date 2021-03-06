package br.com.cadastro.exames.dao;

import java.util.List;

import br.com.cadastro.exames.model.Exame;

public interface ExameDAO {
	
	void salvar(Exame exame);
	void atualizar(Exame exame);
	void remover(long id);
	List<Exame> buscarTodos();
	Exame buscarPorId(long id);
	Exame buscarPorCodigo(String codigo);
	void insertBatch();

}

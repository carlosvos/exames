package br.com.cadastro.exames.dao;

import java.util.List;

import br.com.cadastro.exames.model.Exame;

public interface ExameDAO {
	
	Exame salvar(Exame exame);
	Exame atualizar(Exame exame);
	Exame remover(Exame exame);
	List<Exame> buscarTodos();
	Exame buscarPorId(long id);
	Exame buscarPorCodigo(String codigo);

}

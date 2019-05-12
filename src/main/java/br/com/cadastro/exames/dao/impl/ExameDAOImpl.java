package br.com.cadastro.exames.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.cadastro.exames.dao.ExameDAO;
import br.com.cadastro.exames.model.Exame;

@Repository
public class ExameDAOImpl implements ExameDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void salvar(Exame exame) {
        jdbcTemplate.update("INSERT INTO exames(codigo, nome, descricao) VALUES (?,?,?)", 
        		exame.getCodigo(),
        		exame.getNome(),
        		exame.getDescricao());
	}

	@Override
	public void atualizar(Exame exame) {
		jdbcTemplate.update("UPDATE exames SET codigo = ?, nome = ?, descricao = ?" + 
				"WHERE id = ?", 
        		exame.getCodigo(),
        		exame.getNome(),
        		exame.getDescricao(),
        		exame.getId());		
	}

	@Override
	public void remover(long id) {
		jdbcTemplate.update("DELETE FROM exames WHERE id = ?", id);
	}
	
	@Override
	public List<Exame> buscarTodos() {
		return jdbcTemplate.query("SELECT id, codigo, nome, descricao FROM exames",
                (rs, rowNum) -> new Exame(
                		rs.getInt("id"), 
                		rs.getString("codigo"), 
                		rs.getString("nome"), 
                		rs.getString("descricao")));
	}

	@Override
	public Exame buscarPorId(long id) {
		return jdbcTemplate.query("SELECT id, codigo, nome, descricao FROM exames WHERE id = ?", 
                (rs, rowNum) -> new Exame(
                		rs.getInt("id"), 
                		rs.getString("codigo"), 
                		rs.getString("nome"), 
                		rs.getString("descricao")), id).stream()
				.findFirst()
				.orElse(null);
	}

	@Override
	public Exame buscarPorCodigo(String codigo) {
		return jdbcTemplate.query("SELECT id, codigo, nome, descricao FROM exames WHERE codigo = ?", 
                (rs, rowNum) -> new Exame(
                		rs.getInt("id"), 
                		rs.getString("codigo"), 
                		rs.getString("nome"), 
                		rs.getString("descricao")), codigo).stream()
				.findFirst()
				.orElse(null);
	}
	
	@Override
	public void insertBatch() {
        jdbcTemplate.execute("DROP TABLE exames IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE exames(id SERIAL, codigo VARCHAR(255), nome VARCHAR(255), descricao VARCHAR(255))");
        jdbcTemplate.execute("INSERT INTO exames(codigo, nome, descricao) VALUES ('T1','Teste','Exame de teste')");
    }

}

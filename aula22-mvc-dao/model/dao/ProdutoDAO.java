package aula22_mvc_dao.model.dao;

import java.sql.SQLException;
import java.util.List;

import aula22_mvc_dao.model.vo.Produto;

public interface ProdutoDAO {
	
	public void inserir(Produto produto) throws SQLException;
	public List<Produto> listar() throws SQLException;
	public Produto buscarPorId(int id) throws SQLException;
	public void atualizar(Produto produto) throws SQLException;
	public void deletar(int id) throws SQLException;
}

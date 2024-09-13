package aula22_mvc_dao.controller;

import aula22_mvc_dao.model.dao.ProdutoDAO;
import aula22_mvc_dao.model.vo.Produto;
import aula22_mvc_dao.view.ProdutoView;

import java.sql.SQLException;
import java.util.List;

public class ProdutoController {
	private ProdutoDAO dao;
	private ProdutoView view;

	public ProdutoController(ProdutoDAO dao, ProdutoView ProdutoViewConsole produtoViewConsole) {
		this.dao = dao;
		this.view = view;
	}

	public void salvarProduto (Produto produto) {
        try {
            dao.inserir(produto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public List<Produto> listarProdutos() {
        try {
            return dao.listar();
        } catch (SQLException e) {
            e.printStackTrace();
			return null;
        }
    }

	public void exibirProdutoPorId (int id) {
        try {
            Produto produto =  dao.buscarPorId(id);
			if (produto != null) {
				view.exibirProduto(produto);
			}else{
				view.exibirMensagem("Produto nao encontrado!");
			}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void atualizarProduto(Produto produto) {
        try {
            dao.atualizar(produto);
			view.exibirMensagem("Produto atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

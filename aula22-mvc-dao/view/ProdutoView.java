package aula22_mvc_dao.view;

import java.util.List;

import aula22_mvc_dao.model.vo.Produto;

public interface ProdutoView {
	public void exibirMensagem(String mensagem);
	public void atualizarListaProdutos(List<Produto> produtos);
	public void exibirProduto(Produto produto);
}

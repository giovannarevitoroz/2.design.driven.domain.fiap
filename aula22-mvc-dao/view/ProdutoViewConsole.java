package aula22_mvc_dao.view;

import java.util.List;

import aula22_mvc_dao.model.vo.Produto;

public class ProdutoViewConsole implements ProdutoView {

	@Override
	public void exibirMensagem(String mensagem) {
		System.out.println("Mensagem: " + mensagem);
		
	}

	@Override
	public void atualizarListaProdutos(List<Produto> produtos) {
		System.out.println("Lista de Produtos");
		for (Produto produto : produtos) {
			System.out.println("Produto: " + produto);
		}
		
	}

	@Override
	public void exibirProduto(Produto produto) {
		System.out.println("Produto: " + produto);
		
	}

}

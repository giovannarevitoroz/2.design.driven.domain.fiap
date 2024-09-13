package aula22_mvc_dao.main;

import aula22_mvc_dao.controller.ProdutoController;
import aula22_mvc_dao.model.dao.ProdutoDAO;
import aula22_mvc_dao.model.dao.ProdutoDAOImpl;
import aula22_mvc_dao.model.vo.Produto;
import aula22_mvc_dao.view.ProdutoView;
import aula22_mvc_dao.view.ProdutoViewConsole;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {

    String url = "jdbc:oracle:thin:@localhost:1521/XE";
    String username = "rm558981";
    String password = "fiap";

    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url);
            ProdutoDAO dao = new ProdutoDAOImpl(connection);
            ProdutoController controller = new ProdutoController(dao,new ProdutoViewConsole());

            // exemplo de fluxo de uso para cadastrar um novo produto

            Produto novoProduto = new Produto(0, "Novo Produto",100);
            controller.salvarProduto(novoProduto);
            System.out.println("Mensagem: " + controller.listarProdutos());

            //simular a exibicao - exemplo de listagem de todos os produtos
            List<Produto> produtos = controller.listarProdutos();
            for (Produto produto : produtos) {
                System.out.println("Produto" + produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

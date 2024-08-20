package aula03;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciadorClientes {
    private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private Connection conn;


    public GerenciadorClientes() throws SQLException {
        // oracle.jdbc.pool --> driver JDBC
        // se ocorrer algum problema na execução, o metodo construtor ira jogar para fora a exeção para outro lugar e tratar (throw SQLExeption)
        OracleDataSource ods = new OracleDataSource();

        //configurando a URL
        ods.setURL(url);

        // configurando usuario e senha --> pega os atributos da classe credenciais, sem a necessidade de deixar explicito na URL.
        ods.setUser(Credenciais.user);
        ods.setPassword(Credenciais.pwd);


        conn = ods.getConnection();
    }

    //metodo insert(User)
    public boolean inserir(Cliente c) {
        //criando querys
        String sql = "INSERT INTO cliente VALUES(?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,c.getId());
            ps.setString(2,c.getNome());
            ps.setString(3,c.getSobrenome());
            return ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            }
            // printa os erros
            e.printStackTrace();
            return false;
        } finally {
            try {
                System.out.println("A aplicação não está rodando corretamete");
                System.out.println("Fechando...");
                conn.close();
            } catch (SQLException e) {
                System.err.println("Erro ao encerrar a conexão!");
                e.printStackTrace();
            }
        }

    }

}

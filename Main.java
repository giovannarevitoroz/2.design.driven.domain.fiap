package aula03.main;

import aula03.Cliente;
import aula03.Credenciais;
import aula03.GerenciadorClientes;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        GerenciadorClientes gc = new GerenciadorClientes();

        Cliente c1 = new Cliente(558981,"Giovanna","Revito Roz");

        System.out.println(gc.inserir(c1) ? "Cliente adiconado!" : "Cliente Não adicionado!");

    }

}

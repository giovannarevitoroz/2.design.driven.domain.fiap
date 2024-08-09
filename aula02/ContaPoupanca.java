package aula02;

import java.util.Date;

public class ContaPoupanca extends ContaImpl implements Conta{

    private double saldo;

    @Override
    public void imprimirExtrato() {
        System.out.println(" +++++ Extrato da Conta Poupanca +++++");
        System.out.println("===========================");
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("===========================");
        System.out.println("Data: " + new Date());
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

}

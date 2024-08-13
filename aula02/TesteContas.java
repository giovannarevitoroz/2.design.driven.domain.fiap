package aula02;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        System.out.println("\n====================================\n");

        cc.depositar(3000);
        System.out.println("Saldo: "  + cc.getSaldo());

        cc.sacar(500);
        System.out.println("Saldo: "  + cc.getSaldo());

        System.out.println("\n====================================\n");

        cp.depositar(9000);
        System.out.println("Saldo: "  + cp.getSaldo());

        cp.sacar(500);
        System.out.println("Saldo: "  + cp.getSaldo());

        System.out.println("\n====================================\n");

        GeradorExtrato gerador = new GeradorExtrato();

        gerador.geradorConta(cp);
        gerador.geradorConta(cc);

    }

}

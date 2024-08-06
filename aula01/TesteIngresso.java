package aula01;

public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso i = new Ingresso(20);
        IngressoVIP iv = new IngressoVIP(20,8);
        ColetorIngresso ci = new ColetorIngresso();

        ci.receber(i);
        ci.receber(iv);

        System.out.println("Total: " + ci.getValorTotal());

    }
}

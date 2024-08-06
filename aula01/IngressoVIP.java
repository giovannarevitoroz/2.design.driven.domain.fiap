package aula01;

public class IngressoVIP extends Ingresso {

    private float valorAdicional;

    public IngressoVIP(float valorIngresso, float valorAdicional) {
        super(valorIngresso); //chama o construtor de Ingresso
        System.out.println("======= INGRESSSO VIP CRIADO =======");
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public float calcularValorTotal() {
        return super.getValorIngresso() + this.getValorAdicional();
    }
}

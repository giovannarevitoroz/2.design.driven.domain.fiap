package aula01;

public class Ingresso {

    private float valorIngresso;

    public Ingresso(float valorIngresso) {
        System.out.println("====INGRESSO CRIADO====");
        this.valorIngresso = valorIngresso;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public float calcularValorTotal() {
        return this.getValorIngresso();
    }

}

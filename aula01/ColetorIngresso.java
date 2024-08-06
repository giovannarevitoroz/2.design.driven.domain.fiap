package aula01;

public class ColetorIngresso {
    private float valorTotal;

    public ColetorIngresso() {
        this.valorTotal = 0;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void receber(Ingresso i) {
        this.valorTotal += i.calcularValorTotal();
    }


}


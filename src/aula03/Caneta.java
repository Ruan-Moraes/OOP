package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    protected int carga;
    protected boolean tampada;
    private float ponta;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    private void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;
    }
}

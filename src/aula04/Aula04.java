package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.5f, "Azul");
//        c1.setModelo("BIC");
//        c1.setPonta(0.5f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        System.out.println();

        Caneta c2 = new Caneta("Compactor", 0.7f, "Preta");
        c2.status();

        System.out.println("Tenho uma caneta " + c2.getModelo() + " de ponta " + c2.getPonta());
    }
}

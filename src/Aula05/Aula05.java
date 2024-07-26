package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CP");

        c1.depositar(100);
        c2.depositar(500);

        c1.sacar(150);

        c1.statusConta();
        c2.statusConta();

        c1.sacar(2000);
        c2.fecharConta();
    }
}

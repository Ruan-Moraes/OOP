package Aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();

        c.play();
        c.abrirMenu();

        c.maisVolume();
        c.abrirMenu();

        c.ligarMudo();
        c.abrirMenu();
    }
}

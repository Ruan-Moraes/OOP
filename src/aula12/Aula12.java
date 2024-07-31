package aula12;

public class Aula12 {
    public static void main(String[] args) {
//      Animal n = new Animal()

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.alimentar();
        m.emitirSom();
        m.locomover();

        System.out.println();

        r.setPeso(0.5f);
        r.setIdade(1);
        r.setMembros(4);
        r.setCorEscama("Verde");
        r.alimentar();
        r.emitirSom();
        r.locomover();

        System.out.println();

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorEscama("Cinza");
        p.alimentar();
        p.emitirSom();
        p.locomover();
        p.soltarBolha();

        System.out.println();

        a.setPeso(0.89f);
        a.setIdade(3);
        a.setMembros(2);
        a.setCorPena("Branca");
        a.alimentar();
        a.emitirSom();
        a.locomover();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        c.locomover();
        k.locomover();
        k.emitirSom();
        c.emitirSom();
    }
}

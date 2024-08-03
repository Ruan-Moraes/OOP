package aula15;

public class Aula14 {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula 1 de POO");
        videos[1] = new Video("Aula 12 de PHP");
        videos[2] = new Video("Aula 10 de HTML5");

        Gafanhoto[] gafanhotos = new Gafanhoto[2];
        gafanhotos[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        gafanhotos[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        Visualizacao[] visualizacoes = new Visualizacao[5];
        visualizacoes[0] = new Visualizacao(gafanhotos[0], videos[2]);
        visualizacoes[0].avaliar();
        System.out.println(visualizacoes[0]);

        visualizacoes[1] = new Visualizacao(gafanhotos[0], videos[1]);
        visualizacoes[1].avaliar(87.0f);
        System.out.println(visualizacoes[1]);
    }
}

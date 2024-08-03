package aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula 1 de POO");
        videos[1] = new Video("Aula 12 de PHP");
        videos[2] = new Video("Aula 10 de HTML5");

        Gafanhoto gafanhoto = new Gafanhoto("Jubileu", 22, "M", "juba");


        System.out.println(videos[0].toString());
    }
}

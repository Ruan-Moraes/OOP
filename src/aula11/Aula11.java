package aula11;

public class Aula11 {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa("Pedro", 25, "M");

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        System.out.println(v1);

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");

        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(120);
        b1.setSexo("M");

        b1.pagarMensalidade();
    }
}

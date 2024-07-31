package aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Pedro", 25, "M");
        Aluno a = new Aluno("Pedro", 25, "M", "Informática");
        Professor prof = new Professor("Pedro", 25, "M", "Matemática", 2500);
        Funcionario f = new Funcionario("Pedro", 25, "M", "Secretaria", true);

        System.out.println(p.toString());
        System.out.println(a.toString());
        System.out.println(prof.toString());
        System.out.println(f.toString());

//        p.pagarMensalidade();
        a.pagarMensalidade();
        prof.receberAumento(500);
//        prof.mudarTrabalho();

        p.getSexo();
        a.getSexo();
        prof.getSexo();
        f.getSexo();

        p.fazerAniversario();

        System.out.println(p.toString());
    }
}

package POOJAVA.composição;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAlunos(aluno1);
        curso2.adicionarAlunos(aluno2);

        aluno3.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso1);

        for (Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado/a no curso1 e meu nome é " + aluno.nome);
        }
    }
}

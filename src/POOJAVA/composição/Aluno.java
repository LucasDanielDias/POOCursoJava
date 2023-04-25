package POOJAVA.composição;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    final List<Curso> cursos = new ArrayList<>();



    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}

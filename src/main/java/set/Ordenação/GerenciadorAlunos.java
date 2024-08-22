package main.java.set.Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        if (alunos != null) {
            for (Aluno aluno : alunos) {if (aluno.getMatricula() == matricula) {
                    alunos.remove(aluno);
                    break;
                }
            }
        }
        System.out.println("Aluno removido com sucesso!");
    }

    public Set<Aluno> exibirAlunosPorNome (){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);

        System.out.println("EXIBINDO ALUNOS [COM BASE NO NOME]");
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota (){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);

        System.out.println("EXIBINDO ALUNOS [COM BASE NA NOTA]");
        return alunosPorNota;
    }
    public void exibirAlunos(){
        System.out.println("EXIBINDO ALUNOS");
        alunos.forEach(System.out::println);
    }
}
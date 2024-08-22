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
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.exibirAlunos();

        gerenciador.adicionarAluno("Filipe" ,00L, 7.0);
        gerenciador.adicionarAluno("Junior" ,010L, 9.0);
        gerenciador.adicionarAluno("Leandra" ,05L, 6.5);
        gerenciador.adicionarAluno("Beatriz" ,05L, 6.5);

//      gerenciador.exibirAlunos();
        System.out.println(gerenciador.exibirAlunosPorNome());
    }
}
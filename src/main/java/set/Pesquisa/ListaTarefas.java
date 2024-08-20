package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public Set<Tarefa> removerTarefa(String descricao){
        Set<Tarefa> removido = new HashSet<>();
        for (Tarefa t: tarefas){
            if(!t.getDescricao().isEmpty()){
                System.out.println("A tarefa não existe");
                break;
            } else {
                if (t.getDescricao().equals(descricao)){
                    removido.add(t);
                }
            }
        }
        tarefas.removeAll(removido);
        return tarefas;
    }
    public void exibirTarefas(){
        tarefas.forEach(System.out::println);
//        System.out.println();
//        System.out.println(tarefas);
    }
    public void contarTarefas(){
        System.out.println("O numero total de tarefas é : " + tarefas.size());;
    }
    public ListaTarefas obterTarefasConcluidas() {
        ListaTarefas tarefasConcluidas = new ListaTarefas();
        for (Tarefa t: tarefas){
            if(t.getDescricao().isEmpty()){
                System.out.println("SEM TAREFAS CONCLUIDAS");
            } else {
                if (t.isStatusConclusao()){
                    tarefasConcluidas.adicionarTarefa(t.getDescricao());
                }
            }
        } return tarefasConcluidas;
    }

    public ListaTarefas obterTarefasPendentes(){
        ListaTarefas tarefasPendentes = new ListaTarefas();
        for (Tarefa t: tarefas){
            if(t.getDescricao().isEmpty()){
                System.out.println("SEM TAREFAS PENDENTES");
            } else {
                if (!t.isStatusConclusao()){
                    tarefasPendentes.adicionarTarefa(t.getDescricao());
                }
            }
        } return tarefasPendentes;
    }

    public boolean marcarTarefaConcluida(String descricao){
        for (Tarefa t: tarefas){
            if(!t.getDescricao().equals(descricao)){
                System.out.println("Sem correspondencia encontrada");
        } else return true;
    }

    public boolean marcarTarefaPendente(String descricao){
        String descricaoTemporaria = descricao;
        for (Tarefa t: tarefas){
            if(t.getDescricao().equals(descricao)){
                return false;
            }
        }
    }

    public void limparListaTarefas(){
            tarefas.clear();
        }
    }
}

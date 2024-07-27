package main.java.list.OperaçõesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;
    // Metodo que retorna um novo objeto no ArrayList para cada chamada do atributo
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    // Metodos solicitados
    public void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa(descricao));
        System.out.println("Tarefa "+ descricao + " criada");
    }
    public void removerTarefa (String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : tarefaList){
            if (tarefa.getDescrição().equalsIgnoreCase(descricao)){
             tarefasParaRemover.add(tarefa);
             System.out.println("A tarefa foi " + tarefa +"apagada com sucess");
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
       return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    // psvn -- atalho para chamar metodo principale
    public static void main(String[] args) {
        ListaTarefa tarefasHoje = new ListaTarefa();
        tarefasHoje.adicionarTarefa("Estudar Java hoje");
        tarefasHoje.adicionarTarefa("Estudar Java Collection hoje");
        tarefasHoje.obterDescricoesTarefas();
        tarefasHoje.obterNumeroTotalTarefas();
        tarefasHoje.removerTarefa("Estudar Java hoje");
    }
}

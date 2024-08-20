package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean statusConclusao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatusConclusao() {
        return statusConclusao;
    }

    public void setStatusConclusao(boolean statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    @Override
    public String toString() {
        return "Tarefa : " +
                "descricao: '" + descricao + '\'' +
                ", statusConclusao: " + statusConclusao ;
    }
}

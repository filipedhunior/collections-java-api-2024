package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet;
    // Atributo recebe classe contato como variavel "contatoSet"

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        contatoSet.add(new Contato(nome, numeroTelefone));
    }
//    Adiciona um contato à agenda.
    public void exibirContatos(){
        System.out.println(contatoSet);;
    }
//    Exibe todos os contatos da agenda.
    public void pesquisarPorNome(String nome){}
//    Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public void atualizarNumeroContato(String nome, int novoNumero){}
//    Atualiza o número de telefone de um contato específico.

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
    }
}

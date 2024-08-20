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
        System.out.println("LISTA DE CONTATOS");;
        System.out.println(contatoSet);;
    }
//    Exibe todos os contatos da agenda.
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    //    Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        } return contatoAtualizado;
    }
//    Atualiza o número de telefone de um contato específico.

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Filipe Dhunior", 9-999-9999);
        agenda.adicionarContato("Filipe Dhunior", 7-777-7777);
        agenda.adicionarContato("Felipe Soares", 6-666-6666);
        agenda.adicionarContato("Yoh Asakura", 1-111-1111);

        agenda.exibirContatos();

        agenda.pesquisarPorNome("Filipe Dhunior");

        agenda.exibirContatos();

        agenda.atualizarNumeroContato("Yoh Asakura", 2-222-2222);

        agenda.exibirContatos();
    }
}

package main.java.map.operacoesBasicas;

import main.java.set.Pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;
    // String = nome & Integer = numeroTelefone
    // Não posso usar int no gererics


    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!contatos.isEmpty()){
            // TODO: removendo contato usando somente sua chave
            contatos.remove(nome);
            System.out.println("Contato removido com sucesso!");
        }
   }

    public void exibirContatos(){
        if (contatos.isEmpty()){
            System.out.println("A lista esta vazia!");
            System.out.println(contatos);
        } else {
            System.out.println(contatos.toString());
            // toString vai fazer o mesmo processo de sobrescrita?
        }
    }

    public void pesquisarPorNome(String nome){
        if (!contatos.isEmpty()){
            for(Map.Entry<String, Integer> contato : this.contatos.entrySet()) {
                if (contato.getKey().equals(nome)) {
                    System.out.println("O contato é: " + contato.getKey());
                    System.out.println(contato.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos listaContatos = new AgendaContatos();
        listaContatos.exibirContatos();

        listaContatos.adicionarContato("Filipe", 999999999);
        listaContatos.adicionarContato("Filipe Dhunior", 999999999);
        listaContatos.adicionarContato("Felipe Dhunior", 999999999);
//        INTEGER calcula expressões se houver algum sinal aritmetico

//        listaContatos.pesquisarPorNome("Filipe");

        listaContatos.exibirContatos();

        listaContatos.removerContato("Filipe");
        listaContatos.exibirContatos();
    }
}

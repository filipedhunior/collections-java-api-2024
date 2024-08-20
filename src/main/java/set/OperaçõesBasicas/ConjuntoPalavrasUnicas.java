package main.java.set.OperaçõesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavras = new HashSet<String>();

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
        System.out.println("Palavra [" + palavra + "] adicionada com sucesso!");
    }
//    Adiciona uma palavra ao conjunto.
    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }
//    Remove uma palavra do conjunto.
    public void verificarPalavra(String palavra){
        if (!palavras.contains(palavra)){
            System.out.println("Não contem");
        } else {
            System.out.println("Contem a palavra " + palavra);
        }
    }
//    Verifica se uma palavra está presente no conjunto.
    public void exibirPalavrasUnicas(){
        palavras.forEach(System.out::println);
    }
//    Exibe todas as palavras únicas do conjunto.

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("ola");
        conjunto.adicionarPalavra("hello");
        conjunto.adicionarPalavra("nice!");

        conjunto.verificarPalavra("ola");

        conjunto.removerPalavra("hello");

        conjunto.verificarPalavra("ola");

        conjunto.exibirPalavrasUnicas();
    }


}


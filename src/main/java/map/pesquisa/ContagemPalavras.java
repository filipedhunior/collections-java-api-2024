package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalava(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if (!contagemPalavras.isEmpty()){
            if (contagemPalavras.containsKey(palavra)){
                contagemPalavras.remove(palavra);
            }
        }
    }
    public void exibirContagemPalavras(){
        System.out.println(contagemPalavras.toString());;
    }
    public void encontrarPalavraFrequente(){
        // iterar sobre os itens e comparar o numero de vezes que cada palavra foi usada e salvar numa variavel
    }
}

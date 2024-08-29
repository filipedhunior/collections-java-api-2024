package main.java.map.pesquisa;

import com.sun.jdi.Value;

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
    public void encontrarPalavraFrequente() {
        /*
         * TODO: preciso encontrar a palavra dentro do map que corresponda ao maior Integer de dentro do mapa.
         *   Dividindoa a tarefa fica:
         *   Iterar sobre todas as chaves String
         *   Comparar seus valores na iteração, vendo se ele é maior que o valor anterior
         *   Manter sempre que o valor for o mais alto
         *   Ao final, retornar a Palavra e o Valor que tem o maior valor
         */
        if (!contagemPalavras.isEmpty()) {
            Integer valor = 0;
            String palavra = "";
            for (Map.Entry<String, Integer> palavraValorFrequente : contagemPalavras.entrySet()) {
                if (palavraValorFrequente.getValue() > valor) {
                    valor = palavraValorFrequente.getValue();
                    palavra = palavraValorFrequente.getKey();
                }
            } System.out.println(palavra + " " + valor);
        }

    }

    public static void main(String[] args) {
        ContagemPalavras palavra = new ContagemPalavras();
        palavra.exibirContagemPalavras();

        palavra.adicionarPalava("lorem", 4);
        palavra.adicionarPalava("ipsum", 8); // tem qye ser retornado como o maior valor
        palavra.adicionarPalava("dolor", 3);
        palavra.adicionarPalava("sit", 2);

        palavra.exibirContagemPalavras();

        palavra.removerPalavra("ipsum");

        palavra.exibirContagemPalavras();

        palavra.encontrarPalavraFrequente();
    }
}

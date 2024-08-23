package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    //METODOS
    public void adicionarPalavra(String palavra, String definição){
        if (dicionario.containsKey(palavra)){
            System.out.println("A palavra ultlizada ja existe no sistema!");
        }
        else {dicionario.put(palavra, definição);}
//        System.out.println("Palavra " + palavra + " adicionada com sucesso!");
    }
    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        }
    }
    public void exbirPalavras(){
        System.out.println(dicionario.toString());
    }
    public Map<String, String> pesquisarPorPalavra(String Palavra) {
        Map<String, String> dicionarioPorPalavra = new HashMap<>();

        if (!dicionario.isEmpty()) {
                if (dicionario.containsKey(Palavra)) {
                    dicionarioPorPalavra.put(Palavra, dicionario.get(Palavra));
                }
            } return dicionarioPorPalavra;
        }

    public static void main(String[] args) {
        Dicionario novoDicionario = new Dicionario();

        novoDicionario.exbirPalavras();

        novoDicionario.adicionarPalavra("Correr", "Movimentar-se rapidamente sobre os pés.");
        novoDicionario.adicionarPalavra("Computador", "Dispositivo eletrônico para processamento de dados.");
        novoDicionario.adicionarPalavra("Livro", "Conjunto de folhas impressas ou manuscritas encadernadas.");
        novoDicionario.adicionarPalavra("Cidade", "Área urbana com grande número de habitantes e infraestrutura.");
        novoDicionario.adicionarPalavra("Música", "Arte de organizar sons e ritmos de forma agradável ao ouvido.");
        novoDicionario.adicionarPalavra("Navegar", "Movimentar-se rapidamente sobre os pés.");
        novoDicionario.adicionarPalavra("Estrutura", "Dispositivo eletrônico para processamento de dados.");


        novoDicionario.exbirPalavras();

        novoDicionario.removerPalavra("Navegar");

        novoDicionario.exbirPalavras();

        System.out.println(novoDicionario.pesquisarPorPalavra("Computador"));
        System.out.println(novoDicionario.pesquisarPorPalavra("Cidade"));

        novoDicionario.exbirPalavras();
    }
}

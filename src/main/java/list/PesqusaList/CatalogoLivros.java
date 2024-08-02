package main.java.list.PesqusaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosLista;

    public CatalogoLivros(){
        this.livrosLista = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor,int anoPublicacao){
        livrosLista.add(new Livro(titulo, autor, anoPublicacao));
        System.out.println("O livro "+ titulo+ " de "+ autor+" foi adicionado ao catalogo");
    }

    public void pesquisaPorAutor(String autor){
        livrosLista.forEach(livro -> {
            if (autor == autor){
                System.out.println(livro);
            }
        });
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        for (Livro livro : livrosLista){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                livrosPorTitulo = livro;
                break;
            }
        }
        return livrosPorTitulo;
    }

    public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro livro : livrosLista){
            if (livro.getAnoPublicacão() >= anoInicial && livro.getAnoPublicacão()<=anoFinal){
                livrosPorIntervaloAnos.add(livro);
            }
        } return livrosPorIntervaloAnos;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoPolitico = new CatalogoLivros();
        catalogoPolitico.adicionarLivros(
                "1985", "Orwell", 1940
        );
        catalogoPolitico.adicionarLivros(
                "A revolução dos bichos", "Orwell", 1965
        );
        // catalogoPolitico.pesquisaPorAutor("Orwell");
        System.out.println(catalogoPolitico.pesquisaPorTitulo("1985"));
        System.out.println(catalogoPolitico.pesquisarIntervaloAnos(1939,1941));
    }
}

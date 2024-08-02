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
        System.out.println("O livro "+ titulo+ " de"+ autor+" foi adicionado ao catalogo");
    }

    public void pesquisaPorAutor(String autor){
        livrosLista.forEach(livro -> {
            if (autor == autor){
                System.out.println(livro);
            }
        });
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoPolitico = new CatalogoLivros();
        catalogoPolitico.adicionarLivros(
                "1985", "Orwell", 1940
        );
        catalogoPolitico.adicionarLivros(
                "A revolução dos bichos", "Orwell", 1940
        );
        catalogoPolitico.pesquisaPorAutor("Orwell");

    }
}

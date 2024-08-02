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

    public static void main(String[] args) {
        CatalogoLivros novoLivro00 = new CatalogoLivros();
        novoLivro00.adicionarLivros(
                "1985", "Orwell, George", 1940
        );
    }
}

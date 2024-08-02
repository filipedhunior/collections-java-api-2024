package main.java.list.PesqusaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livrosLista;

    public CatalogoLivros(){
        this.livrosLista = new ArrayList<>();
    }

    public static void main(String[] args) {
        CatalogoLivros novoLivro00 = new CatalogoLivros();
    }
}

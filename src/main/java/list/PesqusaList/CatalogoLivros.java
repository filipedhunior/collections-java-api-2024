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
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 01", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 02", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 02", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 03", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 04", 1994);

        System.out.println(catalogoLivros.pesquisarIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }
}

package main.java.set.Ordenação;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produto;

    public CadastroProdutos() {
        this.produto = new HashSet<>();
    }


    // METODOS
    public void adicionarProduto(long cod, String nome, double preco, int quant) {
        produto.add(new Produto(nome, cod, preco, quant));
    }
    public Set<Produto> exibirProdutoPorNome(){
        // vai usar equals
        Set<Produto> produtoPorNome = new TreeSet<>(produto);
        return produtoPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        // criar um if onde cada numero precisa ser maior que o seu anterior.
        // Caso seja maior, adicionar em uma lista
        Set<Produto> produtoPorPreço = new TreeSet<>(new ComparatorPorPreço());
        produtoPorPreço.addAll(produto);
        return produtoPorPreço;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.exibirProdutoPorNome();
        cadastroProdutos.exibirProdutosPorPreco();

        cadastroProdutos.adicionarProduto(0L, "Maça", 9.00d, 10);
        cadastroProdutos.adicionarProduto(1L, "Maça Verde", 10.00d, 10);
        cadastroProdutos.adicionarProduto(2L, "Banana", 8.00d, 10);
        cadastroProdutos.adicionarProduto(3L, "Banana da Terra", 15.00d, 10);

        System.out.println(cadastroProdutos.produto);

        System.out.println("ORGANIZADO POR [NOME]");
        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println("ORGANIZADO POR [PREÇO]");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

package main.java.set.Ordenação;

import java.util.HashSet;
import java.util.Set;

public class CadastroProdutos {
    Set<Produto> produto;

    public CadastroProdutos() {
        this.produto = new HashSet<>();
    }


    // METODOS
    public void adicionarProduto(long cod, String nome, double preco, int quant) {
        produto.add(new Produto(nome, cod, preco, quant));
    }
    public void exibirProdutoPorNome(){
        // vai usar equals
    }
    public void exibirProdutosPorPreco(){
        // criar um if onde cada numero precisa ser maior que o seu anterior. Caso seja maior, adicionar em uma lista
    }
}

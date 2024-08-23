package main.java.map.ordenacao;

import main.java.map.pesquisa.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> produtosEstoque;

    public EstoqueProdutos() {
        this.produtosEstoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quant, Double preco){
        Produto produto = new Produto(cod, nome, quant, preco);
        produtosEstoque.put(cod, produto);
    }

    public void exibirProdutos(){
        System.out.println(produtosEstoque.toString());
    }

    public int calcularValorTotalEstoque(){
        // Receber a lista produtosEstoque
        // Calcular seus valores individuais por suas quantidades
        // Calcular esse resultado final
        return 0;
    }

    public void obterProdutoMaisCaro(){
        // Altere a saida da classe para Map
        // Use comparator ou comparable
    }
    public void obterProdutoMaisBarato(){
        // Altere a saida da classe para Map
        // Use comparator ou comparable
    }

    public void obterProdutoMaiorQuantValorEstoque(){
        // Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).

    }

    public static void main(String[] args) {

    }
}

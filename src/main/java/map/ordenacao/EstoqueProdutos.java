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
        produtosEstoque.put(cod, new Produto(cod, nome, quant, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtosEstoque.toString());
    }

    public double calcularValorTotalEstoque(){
        // Receber a lista produtosEstoque
        // Calcular seus valores individuais por suas quantidades
        // Calcular esse resultado final
        double valorTotalEstoque;
        if (!produtosEstoque.isEmpty()){
            for (Produto produto : produtosEstoque.values()){
                valorTotalEstoque += produto.getPreco() * produto.getQuant();
            }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro (){
            Produto produtoMaisCaro = null;
            double maiorPreço = Double.MIN_VALUE;
            for (Produto p : produtosEstoque.values()){
                if (p.getPreco() > maiorPreço){
                    produtoMaisCaro = p;
                }
            }
        }
        // Altere a saida da classe para Map
        // Use comparator ou comparable
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null; // produto que vai ser mostrado na saida
        double menorPreço = Double.MAX_VALUE;
        for (Produto produto : produtosEstoque.values()){
            if (produto.getPreco() < menorPreço){
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    public void obterProdutoMaiorQuantValorEstoque(){
        // Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).

    }

    public static void main(String[] args) {

    }
}

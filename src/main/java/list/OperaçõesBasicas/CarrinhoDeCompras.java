package main.java.list.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Molde da lista como atributo
    private List<Item> itemList;
    private String nome;

    // Chamada da lista via construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quant){
        this.nome = nome;
        itemList.add(new Item());
        System.out.println("Item adicionado ao carrinho");
    }

    public void removerItem(String nome){

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Iphone 15", 3.500, 2);
    }
}

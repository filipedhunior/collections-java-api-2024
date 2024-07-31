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

    /*
        Para remover os items da lista, vamos criar uma nova lista de escopo de metodo, iterar  sobre ela e adicionar os items correspondentes a entrada a ela e apos isso, eliminar os elementos da lista corresponte a lista original. Isto a cada chamada do metodo
    */
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itemList){
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Iphone 15", 3.500, 2);
    }
}

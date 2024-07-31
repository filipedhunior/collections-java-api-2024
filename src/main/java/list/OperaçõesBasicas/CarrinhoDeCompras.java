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

    public void adicionarItem(String nome, double preco, double quant){
        this.nome = nome;
        itemList.add(new Item(nome, preco, quant));
        System.out.println("Item [" + nome + "] [R$"+ (preco*quant) + "00] adicionado ao carrinho");
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

    public double calcularValorTotal(){
        List<Item> valorTotalCarrinho = new ArrayList<>();
        double valorTotal = 0;
        for (Item item : itemList){
            valorTotal = valorTotal+(item.getPreco()* item.getQuant());
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Iphone 14", 3.500,1.0);
        carrinho.adicionarItem("Iphone 15", 4.500,2.0);

        System.out.printf("Valor total do carrinho = R$ %.3f", carrinho.calcularValorTotal());
    }
}

package main.java.list.OperaçõesBasicas;

public class Item {
    private String nome;
    private double preco;
    private double quant;

    public Item(String nome, double preco, double quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuant() {
        return quant;
    }

    @Override
    public String toString() {
        return '\''+ " "+
                "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + quant +
                '}';
    }
}

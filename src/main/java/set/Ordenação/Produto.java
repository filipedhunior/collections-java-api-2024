package main.java.set.Ordenação;

public class Produto {
    private String nome;
    private long cod;
    private double preco;
    private int quant;

    public Produto(String nome, long cod, double preco, int quant) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    //    toString - SOBRESCEVER HASH DE MEMORIA
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preço=" + preco +
                ", quant=" + quant +
                '}';
    }
}

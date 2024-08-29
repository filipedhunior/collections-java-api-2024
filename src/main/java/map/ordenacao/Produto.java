package main.java.map.ordenacao;

public class Produto{
    private Long cod;
    private String nome;
    private int quant;
    private double preco;

    public Produto(Long cod, String nome, int quant, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", quant=" + quant +
                ", preco=" + preco +
                '}';
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

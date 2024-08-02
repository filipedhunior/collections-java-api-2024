package main.java.list.PesqusaList;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacão;

    public Livro(String titulo, String autor, int anoPublicacão) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacão = anoPublicacão;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacão() {
        return anoPublicacão;
    }

    public void setAnoPublicacão(int anoPublicacão) {
        this.anoPublicacão = anoPublicacão;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "'" + titulo + '\'' +
                ", autor: " + autor + '\'' +
                ", ano de Publicacão: " + anoPublicacão ;
    }
}

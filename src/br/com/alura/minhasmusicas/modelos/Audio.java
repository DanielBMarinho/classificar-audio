package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalDeCurtidas;
    private int Classificação;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificação() {
        return Classificação;
    }

    public void curte() {
        this.totalDeCurtidas++;
    }

    public void reproduz () {
        this.totalReproducoes++;
    }
}

package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String decricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    @Override
    public int getClassificação() {
        if (this.getTotalDeCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}

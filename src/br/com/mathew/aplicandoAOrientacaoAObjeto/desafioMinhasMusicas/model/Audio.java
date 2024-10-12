package br.com.mathew.aplicandoAOrientacaoAObjeto.desafioMinhasMusicas.model;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

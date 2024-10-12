package br.com.mathew.aplicandoAOrientacaoAObjeto.minhasMusicas.model;

public class Podcast extends Audio{
    private String host;
    private String descricao;
    private String autor;

    public String getDescricao() {
        return descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public double getClassificacao() {
        return getTotalCurtidas() > 500 ? 10 : 8;
    }
}

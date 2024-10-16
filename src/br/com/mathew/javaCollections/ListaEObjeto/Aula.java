package br.com.mathew.javaCollections.ListaEObjeto;

public class Aula implements Comparable<Aula>{
        private String titulo;
        private int tempo;

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}

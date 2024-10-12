package br.com.mathew.aplicandoAOrientacaoAObjeto.desafioFinalMinhasMusicas.principal;

import br.com.mathew.aplicandoAOrientacaoAObjeto.desafioFinalMinhasMusicas.model.MinhasFavoritas;
import br.com.mathew.aplicandoAOrientacaoAObjeto.desafioFinalMinhasMusicas.model.Musica;
import br.com.mathew.aplicandoAOrientacaoAObjeto.desafioFinalMinhasMusicas.model.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Quarta cadeira");
        musica.setArtista("matheus e kaua");

        for (int i = 0;  i < 1000; i++) {
            musica.reproduz();
        }
        for (int i = 0;  i < 30; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();

        podcast.setTitulo("his do brasil");
        podcast.setAutor("alex");

        for (int i = 0;  i < 3000; i++) {
            podcast.reproduz();
        }
        for (int i = 0;  i < 600; i++) {
            podcast.curte();
        }

        Podcast podcast2 = new Podcast();
        podcast2.setTitulo("his do siria");
        podcast2.setAutor("lucas");

        for (int i = 0;  i < 3000; i++) {
            podcast2.reproduz();
        }
        for (int i = 0;  i < 300; i++) {
            podcast.curte();
        }
        System.out.println(podcast.getClassificacao());
        System.out.println(musica.getClassificacao());

        MinhasFavoritas favoritas  = new MinhasFavoritas();
        favoritas.inculi(podcast);
        favoritas.inculi(podcast2);
        favoritas.inculi(musica);
        System.out.println(favoritas.getMinhasMusicasPreferidas());
    }
}

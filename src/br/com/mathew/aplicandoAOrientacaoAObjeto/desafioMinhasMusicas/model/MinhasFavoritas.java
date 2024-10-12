package br.com.mathew.aplicandoAOrientacaoAObjeto.desafioMinhasMusicas.model;

import java.util.ArrayList;
import java.util.List;

public class MinhasFavoritas {

    List<String> minhasMusicasPreferidas = new ArrayList<>();

    public void inculi(Audio audio){
        if (audio.getClassificacao() >= 9) {
            minhasMusicasPreferidas.add(audio.getTitulo());
        } else {
            System.out.println("nao foi incluida a seire/filme " + audio.getTitulo());
        }
    }

    public List<String> getMinhasMusicasPreferidas() {
        return minhasMusicasPreferidas;
    }
}

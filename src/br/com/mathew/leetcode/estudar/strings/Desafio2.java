package br.com.mathew.leetcode.estudar.strings;

public class Desafio2 {

//  Desafio 2 — Contar vogais em uma palavra

    public static int quantidadeVogais(String palavra){

        int tamanho = palavra.length();
        int quantidadeVogais = 0;

        for (int i = 0; i < tamanho; i++){
            char letraAtual = palavra.toLowerCase().charAt(i);

            if (letraAtual == 'a' || letraAtual == 'e' || letraAtual == 'i' || letraAtual == 'o' || letraAtual == 'u') {
                quantidadeVogais++;
            }

        }

    }
}

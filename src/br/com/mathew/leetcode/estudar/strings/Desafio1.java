package br.com.mathew.leetcode.estudar.strings;

public class Desafio1 {

//    Crie um método que recebe uma String e
//    retorna true se a primeira e a última
//    letra forem iguais, ou false caso contrário.

    public static void main(String[] args) {

        System.out.println(verficarIgualdade("leal"));
        System.out.println(verficarIgualdade("lealdade"));

    }
    public static boolean verficarIgualdade(String palavra){

        if (palavra == null || palavra.isEmpty()) return false;

        char ultimaLetra = palavra.charAt(palavra.length()-1);
        char primeiraLetra = palavra.charAt(0);

        return primeiraLetra == ultimaLetra;
    }
}


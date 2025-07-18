package br.com.mathew.leetcode.estudar.strings;

public class AULA1_FundamentosDeString {
//    🎯 Objetivo
//    Entender e praticar os 4 métodos mais essenciais:
//
//    Método	Para que serve
//    charAt()	Pegar uma letra de uma posição
//    length()	Saber quantas letras a string tem
//    substring()	Cortar partes da string
//    equals()	Comparar o conteúdo de duas strings

    public static void main(String[] args) {
//        charAt(int i) — Pegar letra por posição
        String nome = "mathew";
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(nome.length()-1));

//        length() — Saber quantos caracteres tem
        System.out.println(nome.length());

//        substring(início, fim) — Cortar pedaços da string
        System.out.println(nome.substring(0,2));
        System.out.println(nome.substring(2,6));

//        equals() vs ==\
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a == b);        // true (referência igual)
        System.out.println(a == c);        // false (referência diferente)
        System.out.println(a.equals(c));   // ✅ true (mesmo conteúdo!)
    }

}

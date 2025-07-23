package br.com.mathew.leetcode.estudar.estruturaDeDados.arrays;

public class desafio1 {
    public static void main(String[] args) {
        int[] num = {2,3, 0,5,-2};

        int[] numeros2 = {2,3};

        System.out.println(mediaPositivos(num));
        System.out.println(mediaPositivos(numeros2));
    }
    public static double mediaPositivos(int[] numeros) {
        int soma = 0;
        double media = 0;
        int totalDeNumeroCalcuculados = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                soma = soma + numeros[i];
                totalDeNumeroCalcuculados++;
            }
        }

        if (totalDeNumeroCalcuculados > 0) {
            media = (double) soma / totalDeNumeroCalcuculados;
        } else {
            media = 0;
        }

        return media;
    }

}


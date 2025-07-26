package br.com.mathew.leetcode.estudar.estruturaDeDados.arrays;

public class produtosTdsElementosExcetoAtual {
    public static void main(String[] args) {

        produtoExcetoAtual(new int[]{1, 2, 3, 4});   // [24, 12, 8, 6]
        produtoExcetoAtual(new int[]{2, 3, 4, 5});   // [60, 40, 30, 24]
        produtoExcetoAtual(new int[]{1, 0, 3, 4});   // [0, 12, 0, 0]

    }

    public static void produtoExcetoAtual(int[] nums){
        int n = nums.length;
        int[] esquerda = new int[n];
        int[] direita = new int[n];
        int[] resultado = new int[n];

        //verficar a esquerda
        for (int i = 0; i<n ;i++){
            if (i == 0){
                esquerda[i]=1;
            }else{
                esquerda[i] = nums[i-1] * esquerda[i-1] ;
            }
        }

        //direita
        for (int i=n-1 ; i>=0 ;i--){
            if (i==n-1){
                direita[i]=1;
            }else {
                direita[i]= nums[i+1] * direita[i+1];
            }
        }

        //total
        for (int i= 0 ; i<n; i++){
            resultado[i]=esquerda[i]*direita[i];
        }
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

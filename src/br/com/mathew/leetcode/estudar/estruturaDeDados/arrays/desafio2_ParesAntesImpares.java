package br.com.mathew.leetcode.estudar.estruturaDeDados.arrays;

public class desafio2_ParesAntesImpares {
    public static void main(String[] args) {
        paresAntesImpares(new int[] {3, 1, 2, 4});
        paresAntesImpares(new int[] {3, 6, 2, 4});
        paresAntesImpares(new int[] {3,6, 8, 5, 1, 2, 4});
    }
    public static void paresAntesImpares(int[] nums){
        int posicaoTroca=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] % 2== 0){
                int temp= nums[posicaoTroca];
                nums[posicaoTroca]=nums[i];

                if (i != posicaoTroca){
                    nums[i]=temp;
                }
                posicaoTroca++;
            }
        }
    }
}

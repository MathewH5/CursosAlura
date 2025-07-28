package br.com.mathew.leetcode;

public class ex6_RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int novoTamanho = removeElement(nums, 3);

        System.out.print("Saída: " + novoTamanho + ", números = [");

        for (int i = 0; i < nums.length; i++) {
            if (i < novoTamanho) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }

            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int novoTamanho2 = removeElement(nums2, 2);

        System.out.print("Saída: " + novoTamanho2 + ", números = [");

        for (int i = 0; i < nums2.length; i++) {
            if (i < novoTamanho2) {
                System.out.print(nums2[i]);
            } else {
                System.out.print("_");
            }

            if (i < nums2.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }

    public static int removeElement(int[] nums, int val) {
        int posicaoLivre = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[posicaoLivre] = nums[i];

                if (i != posicaoLivre) {
                    nums[i] = 0;
                }

                posicaoLivre++;
            }
        }

        return posicaoLivre;
    }
}

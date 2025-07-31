package br.com.mathew.leetcode.estudar.estruturaDeDados.arrays;

public class desafio2_com2ponteiros {
    public static void main(String[] args) {
        paresAntesImpares(new int[] {3, 1, 2, 4});
        paresAntesImpares(new int[] {3, 1, 2, 5});
        paresAntesImpares(new int[] {3, 6, 2, 4});
        paresAntesImpares(new int[] {3,6, 8, 5, 1, 2, 4});
    }
    public static void paresAntesImpares(int[] nums){

        int left = 0;
        int right = nums.length - 1;

        while (left<right){
            if (nums[left]%2==0){
                left++;
            }
            else if (nums[right]%2==1){
                right--;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right]=temp;
            }
        }

    }
}

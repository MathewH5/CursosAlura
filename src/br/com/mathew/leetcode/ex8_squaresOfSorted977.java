package br.com.mathew.leetcode;

import java.util.Arrays;

public class ex8_squaresOfSorted977 {
    public static void main(String[] args) {
        int[] sortedSquares1 = sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(Arrays.toString(sortedSquares1));

        int[] sortedSquares2 = sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(sortedSquares2));

        int[] sortedSquares3 = sortedSquares(new int[]{-5,-3,-2,-1});
        System.out.println(Arrays.toString(sortedSquares3));

    }
    public static int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int left = 0;
        int right = nums.length - 1;
        int pos =  nums.length - 1;
        int[] resultado = new int[nums.length];

        while (left<=right){
            int numLeft = nums[left];
            int numRight = nums[right];

            if (numLeft>numRight){
                resultado[pos] = numLeft;
                left++;
            }else{
                resultado[pos] = numRight;
                right--;
            }
            pos--;
        }
        return resultado;
    }
}

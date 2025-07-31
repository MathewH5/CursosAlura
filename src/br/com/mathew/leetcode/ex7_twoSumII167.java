package br.com.mathew.leetcode;

import java.util.Arrays;

public class ex7_twoSumII167 {
    public static void main(String[] args) {
        int[] twosum1 = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(twosum1));

        int[] twosum2 = twoSum(new int[]{1, 2, 3, 4, 6}, 6);
        System.out.println(Arrays.toString(twosum2));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left<right){
            int numLeft = numbers[left];
            int numRight = numbers[right];
            if (numLeft + numRight < target){
                left++;
            }else if (numLeft + numRight > target){
                right--;
            }else {
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{left,right};
    }
}

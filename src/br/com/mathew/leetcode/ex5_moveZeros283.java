package br.com.mathew.leetcode;

public class ex5_moveZeros283 {
    public static void main(String[] args) {
        moveZeroes(new int[] { 0,1,0,3,12}); //Output: [1,3,12,0,0]
        moveZeroes(new int[] {0, 0, 1});
        moveZeroes(new int[] {1,2,3});
    }
    public static void moveZeroes(int[] nums) {
        int posicaoVazia = 0;

        for (int i=0 ; i<nums.length ; i++){
            if (nums[i] != 0){
                nums[posicaoVazia]= nums[i];
                if (i!=posicaoVazia){
                    nums[i] = 0;
                }
                posicaoVazia++;
                }
        }
    }
}

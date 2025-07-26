package br.com.mathew.leetcode;

public class ex4_SubmatrizMaxima53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
        System.out.println(maxSubArray(new int[]{1}));                    // 1
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));           // 23
        System.out.println(maxSubArray(new int[]{-1,-2,-3}));             // -1
        System.out.println(maxSubArray(new int[]{5, 4, -5, 7, 8}));       // 19
        System.out.println(maxSubArray(new int[]{-2,1,-3}));              // 1
    }

    public static int maxSubArray(int[] nums) {
        int maxAtual = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxAtual = Math.max(maxAtual + nums[i], nums[i]);

            if (maxAtual > maxGlobal) {
                maxGlobal = maxAtual;
            }
        }

        return maxGlobal;
    }
}

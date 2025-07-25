package br.com.mathew.leetcode.estudar.estruturaDeDados.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximoSubarrayKadanesAlgorithm {
    public static void main(String[] args) {
        maxSubarraySoma(new int[]{-2,1,-3,4,-1,2,1,-5,4}); // 6 → [4,-1,2,1]
        maxSubarraySoma(new int[]{1});                    // 1
        maxSubarraySoma(new int[]{5,4,-1,7,8});           // 23
        maxSubarraySoma(new int[]{-1,-2,-3});             // -1
        maxSubarraySoma(new int[]{5, 4, -5, 7, 8});       // 19
        maxSubarraySoma(new int[]{-2,1,-3});

    }

    public static void   maxSubarraySoma(int[] nums){

        int maxAtual = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide se continua o subarray atual ou reinicia
            if (maxAtual + nums[i] > nums[i]) {
                maxAtual = maxAtual + nums[i];
            } else {
                maxAtual = nums[i];
            }

            // Atualiza o maior valor encontrado
            if (maxAtual > maxGlobal) {
                maxGlobal = maxAtual;
            }
        }

        System.out.println(maxGlobal);

    }
}

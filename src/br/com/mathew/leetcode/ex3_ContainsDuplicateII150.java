package br.com.mathew.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ex3_ContainsDuplicateII150 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer , Integer> ultimoIndice  = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer anterior = ultimoIndice.get(num);

            if (anterior != null && i - anterior <= k) {
                return true;
            }
            ultimoIndice.put(num, i);
        }
        return false;
    }
}

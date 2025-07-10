package br.com.mathew.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public int[] twoSum(int[] nums, int target) {

        //cria um pares chave/valor
        Map<Integer, Integer> mapa = new HashMap<>();

        //percorre os dados do vetor (ate achar o resultado)
        for (int i = 0; i < nums.length; i++) {

            // verfica se o target= valor que eles querem - o numero do index que estamos
            int complemento = target - nums[i];

            // se o restante desse valor existir
            // ele diz o Value do KEY VALUE(KV) do complemento com o get e o index do i tambem
            if (mapa.containsKey(complemento)){
                return new int[]{mapa.get(complemento), i};
            }

            //adicona ao hashmap
            mapa.put(nums[i],i);

        }

        return new int[] {}; // nunca vai acontecer (problema garante que sempre tem solução)
    }
}

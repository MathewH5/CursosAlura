package br.com.mathew.leetcode;

public class ex2_BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
    int menorPreco = prices[0];
    int maiorLucro = 0;

    for(int i = 0; i < prices.length; i++){

        int precoHoje = prices[i];

        if(precoHoje < menorPreco){
            menorPreco = precoHoje;
        }else{
            int lucroHoje = precoHoje - menorPreco;

            if(lucroHoje > maiorLucro){
                maiorLucro = lucroHoje;
            }
        }
    }
    return maiorLucro;
}

}

package br.com.mathew.faculdade.analiseDeAlgoritimos;

public class ex7 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 0}
        };

        // se ver 0 ele para
        // se ver 1 ele conta, vai somando 1++
        // verfica se a  soma e maior que a ultima linha, se for ele salva qual coluna
        // quando terminar a linha ele pula pra proxima
        // podemos saber o tamanho da matriz. usando lengh

        // entao precisamos saber o tamanho
        // a coluna que estamos

        int tamanho = matriz.length ; // linhas
        int maiorLinha = 0;
        int linha = 0;
        int coluna = 0;


        int colunaComMaisUns = calulcarOndeTemMaisUns(matriz, tamanho, linha, coluna );

        System.out.println(colunaComMaisUns);

        //precisa ser linar e nao quadratica




    }
    private static int calulcarOndeTemMaisUns(int[][] martiz, int tamanho, int linha, int coluna){

        int LinhaComMaisUns = 0;
        while (linha < tamanho && coluna < tamanho){
            if (martiz[linha][coluna] == 1){
                coluna ++;
                LinhaComMaisUns = linha+1;
            }else {
                linha++;
            }
        }

        return LinhaComMaisUns;
    }
}

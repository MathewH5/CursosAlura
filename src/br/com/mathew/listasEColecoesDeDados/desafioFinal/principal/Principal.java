package br.com.mathew.List.desafioFInal.principal;

import br.com.mathew.List.desafioFInal.model.CartaoDeCredito;
import br.com.mathew.List.desafioFInal.model.Compra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o limite do cartao: ");
        double limite = leia.nextDouble();


        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int sair= 1;
        do {
            System.out.println("Qual produto que deseja fazer? ");
            String produto = leia.next();

            System.out.println("Digite o valor do produto: ");
            double valor = leia.nextDouble();

            Compra compra = new Compra(produto, valor);

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = leia.nextInt();
            compra.setQuantidade(quantidade);

            if (cartaoDeCredito.lancaCompra(compra)){
                System.out.println("compra efetuado com sucesso!\nSEU SALDO RESTANTE É DE " + cartaoDeCredito.getSaldo());
            }
            else {
                System.out.println("compra fracasada. SEM SALDO!\nSEU SALDO RESTANTE É DE " + cartaoDeCredito.getSaldo());
            }

            if (cartaoDeCredito.getSaldo() != 0){
                System.out.println("deseja finalizar as compras? (0 para sair ou qualquer numero para contiunar): ");
                sair = leia.nextInt();
            }
            else {
                sair = 0;
            }
        }while (sair != 0 );

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("compras realizadas com sucesso\n");
        for(Compra compra : cartaoDeCredito.getCompras()){
            System.out.println(compra.getProduto() + " - " + compra.getPreco() + " - " + compra.getQuantidade() + " Total: " + compra.getPreco()*compra.getQuantidade());
        }
        System.out.println("\no resante do credito é de: " + cartaoDeCredito.getSaldo());
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");


    }
}

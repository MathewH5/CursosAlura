package br.com.mathew.listasEColecoesDeDados.desafioFinal.model;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras = new ArrayList<>();

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if(compra.getPreco() * compra.getQuantidade() <= this.saldo){
            compras.add(compra);
            this.saldo -= compra.getPreco()*compra.getQuantidade();
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}

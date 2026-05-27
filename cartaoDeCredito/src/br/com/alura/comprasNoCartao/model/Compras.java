package br.com.alura.comprasNoCartao.model;

public class Compras {

    private String item;
    private double valor;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Compras(double valor, String item) {
        this.item = item;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getItem() + " - " +  getValor();
    }


}

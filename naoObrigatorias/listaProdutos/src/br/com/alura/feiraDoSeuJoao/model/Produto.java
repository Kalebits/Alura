package br.com.alura.feiraDoSeuJoao.model;

public class Produto {

    private String item;
    private double preco;
    private double quantidade;

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getItem() {
        return item;
    }

    public Produto(String item, double preco, double quantidade) {
        this.item = item;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return this.getItem();
    }


}

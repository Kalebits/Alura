package br.com.alura.comprasNoCartao.model;

import br.com.alura.comprasNoCartao.interfaces.atualizarSaldo;

public class Cartao implements atualizarSaldo {

    private double saldo;
    private String bandeira;


    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cartao: " + bandeira + ", saldo: " + saldo;
    }

    public Cartao(String bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public double atualizarSaldo(double gasto) {
        return this.saldo -= gasto;
    }
}

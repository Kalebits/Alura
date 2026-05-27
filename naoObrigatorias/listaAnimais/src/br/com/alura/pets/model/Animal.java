package br.com.alura.pets.model;

import java.time.LocalDate;

public class Animal {

    private String nome;
    private String raca;
    private LocalDate dataDeNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", raça: " + raca +
                ", data de nascimento: " + dataDeNascimento;
    }

    public Animal(String nome, String raca, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.dataDeNascimento = dataDeNascimento;
    }
}

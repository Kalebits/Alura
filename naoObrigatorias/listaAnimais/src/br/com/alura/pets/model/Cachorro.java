package br.com.alura.pets.model;

import java.time.LocalDate;

public class Cachorro extends Animal {

    private boolean vacinaRaiva;
    private boolean vacinaV8;


    public Cachorro(String nome, String raca, LocalDate dataDeNascimento) {
        super(nome, raca, dataDeNascimento);
    }

    public boolean isVacinaRaiva() {
        return vacinaRaiva;
    }

    public void setVacinaRaiva(boolean vacinaRaiva) {
        this.vacinaRaiva = vacinaRaiva;
    }

    public boolean isVacinaV8() {
        return vacinaV8;
    }

    public void setVacinaV8(boolean vacinaV8) {
        this.vacinaV8 = vacinaV8;
    }

}

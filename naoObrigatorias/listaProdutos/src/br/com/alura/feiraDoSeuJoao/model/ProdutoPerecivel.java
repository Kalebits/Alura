package br.com.alura.feiraDoSeuJoao.model;

import java.time.LocalDate;
import java.util.Date;

public class ProdutoPerecivel extends Produto {

    private LocalDate dataDeValidade;

    public ProdutoPerecivel(String item, double preco, double quantidade, LocalDate dataDeValidade) {
        super(item, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String verificarValidade(LocalDate dataDeHoje) {
        if (dataDeValidade.isBefore(dataDeHoje)) {
            return "fora do prazo de validade";
        }
        else
            return "dentro do prazo de validade";
    }
}

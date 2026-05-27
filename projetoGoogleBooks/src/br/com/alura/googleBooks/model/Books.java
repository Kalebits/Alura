package br.com.alura.googleBooks.model;

import java.util.List;

public class Books {

    private String titulo;
    private String subtitulo;
    private String descricao;
    private List<String> autores;

    public Books(String titulo, String subtitulo, String descricao, List<String> autores) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descricao = descricao;
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nSubtítulo: " + subtitulo +
                "\nDescrição: " + descricao +
                "\nAutores: " + autores;
    }
}

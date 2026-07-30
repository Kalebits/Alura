package br.com.alura.screenmatch.excecao;

public class ExcecaoDeAno extends RuntimeException {
    String mensagemErro;
    public ExcecaoDeAno(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    @Override
    public String getMessage() {
        return this.mensagemErro;
    }
}

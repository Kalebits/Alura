package br.com.alura.audiomatch.model;

import br.com.alura.audiomatch.interfaces.Curtido;
import br.com.alura.audiomatch.interfaces.TempoFormatado;

public class Podcast extends Audio implements TempoFormatado, Curtido {

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getTempo(){
        int resultadoSegundos = this.getDuracaoEmSegundos()/60;

        /// 1h30m25s
        if(resultadoSegundos>60){
            int resultadoMinutos = resultadoSegundos/60;
            return resultadoMinutos + ":" + (resultadoSegundos - (resultadoMinutos*60)) + ":" + (this.getDuracaoEmSegundos()%60);
        }
        else
            return resultadoSegundos + ":" + (this.getDuracaoEmSegundos()%60);


    }

    @Override
    public String getCurtida(){
        if(isCurtida()){
            return "O título já foi curtido!";
        }else
            return "Até o momento o título não foi curtido!";
    }

}

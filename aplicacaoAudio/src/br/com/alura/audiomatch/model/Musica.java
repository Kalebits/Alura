package br.com.alura.audiomatch.model;

import br.com.alura.audiomatch.interfaces.Curtido;
import br.com.alura.audiomatch.interfaces.TempoFormatado;

public class Musica extends Audio implements TempoFormatado, Curtido {

    private String estiloMusical;

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    @Override
    public String getTempo(){
        int resultado = this.getDuracaoEmSegundos()/60;

        return resultado + ":" + (this.getDuracaoEmSegundos()-(resultado*60));
    }

    @Override
    public String getCurtida(){
        if(isCurtida()){
            return "Música já curtida!";
        }else
            return "Música sem avaliação!";
    }
}

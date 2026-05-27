package br.com.alura.audiomatch;

import br.com.alura.audiomatch.model.Musica;
import br.com.alura.audiomatch.model.Podcast;

public class Aplicativo {
    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.setTitulo("Apesar de você");
        m1.setAutor("Chico Buarque");
        m1.setCurtida(true);
        m1.setDuracaoEmSegundos(235);
        m1.setEstiloMusical("MPB");
        m1.setCurtida(true);
        m1.setTotalDeReproducoes(77388942);
        System.out.println("""
                A primeira musica cadastrada é: %s
                de %s do estilo %s e tendo %s minutos de duração já tendo %,d reproduções.
                %s
                """.formatted(m1.getTitulo(), m1.getAutor(), m1.getEstiloMusical(), m1.getTempo(), m1.getTotalDeReproducoes(), m1.getCurtida()));

        Podcast p1 = new Podcast();
        p1.setTitulo("Aprovação de Lula crescem jovens no Nepal utilizam Discord " +
                "como \"parlamento\", escândalo com protetores solares na Austrália e mais");
        p1.setAutor("the news");
        p1.setDescricao("Anuncios aqui");
        p1.setCurtida(true);
        p1.setDuracaoEmSegundos(888);
        p1.setTotalDeReproducoes(15000);

        System.out.println("""
                Podcast produzido por %s
                %s
                Tempo de duração de %s
                Um total de %d reproduções
                %s
                %s
                """.formatted(p1.getAutor(),p1.getTitulo(), p1.getTempo(), p1.getTotalDeReproducoes(), p1.getDescricao(), p1.getCurtida()));
        System.out.println(p1.getTempo());

    }
}

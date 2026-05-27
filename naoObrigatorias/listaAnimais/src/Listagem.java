import br.com.alura.pets.model.Animal;
import br.com.alura.pets.model.Cachorro;

import java.time.LocalDate;
import java.util.ArrayList;

public class Listagem {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Lola", "Lulu",
                LocalDate.of(2020, 5, 15));
        Cachorro c2 = new Cachorro("Teddy", "Pug",
                LocalDate.of(2018, 3, 22));
        Cachorro c3 = new Cachorro("Buddy", "Pastor alemão",
                LocalDate.of(2017, 8, 2));

        Animal a1 = c1;


        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(a1);

        animais.forEach(System.out::println);


    }
}

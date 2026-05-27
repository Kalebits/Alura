import br.com.alura.feiraDoSeuJoao.model.Produto;
import br.com.alura.feiraDoSeuJoao.model.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrinho {
    public static void main(String[] args) {

        Produto p1 = new Produto("maçã", 2.5, 1);
        Produto p2 = new Produto("Melão", 8, 1);
        Produto p3 = new Produto("Melância", 15, 1);

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        ProdutoPerecivel pp2 = new ProdutoPerecivel("Abacaxi", 15, 1,
                LocalDate.of(2025, 11, 30));

        produtos.add(pp2);

        System.out.println("Temos " + produtos.size() + " produtos");
        System.out.println("O primeiro deles é a " + produtos.get(0).getItem());
        System.out.println(produtos);
        System.out.println("O produto " + produtos.get(3) + " está " + pp2.verificarValidade(LocalDate.now()));

        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        System.out.println(soma/produtos.size());
    }
}

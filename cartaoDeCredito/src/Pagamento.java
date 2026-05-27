import br.com.alura.comprasNoCartao.model.Cartao;
import br.com.alura.comprasNoCartao.model.Compras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {

        boolean continuar = true;
        Cartao c1 = new Cartao("Mastercard");
        Scanner sc = new Scanner(System.in);
        ArrayList<Compras> compras = new ArrayList<>();

        System.out.println("Digite o saldo do cartão");
        c1.setSaldo(sc.nextDouble());

        do {
            System.out.println("Digite o item que comprou:");
            String item = sc.next();
            System.out.println("Digite o valor do item comprado");
            double valor = sc.nextDouble();
            if(valor > c1.getSaldo()){
                System.out.println("Saldo insuficiente");
                break;
            }
            else{
                c1.atualizarSaldo(valor);
                Compras compra = new Compras(valor, item);
                compras.add(compra);
                System.out.println("Deseja continuar? (1 = sim / 0 = não)");
                if(sc.next().equals("0")){
                    continuar = false;
                }
            }
        }while(continuar || c1.getSaldo() == 0);

        compras.sort(Comparator.comparing(Compras::getValor));
        compras.forEach(System.out::println);
        System.out.println("Saldo do cartão: " + c1.getSaldo());


    }
}

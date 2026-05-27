import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean sair = true;
        System.out.println("""
                ************************************
                Dados iniciais do cliente:
                
                Nome:             Kaleb Baptista
                Tipo conta:       Corrente
                Saldo Inicial:    R$ 100.00
                *************************************
                """);
        double saldo = 100.0;
        while(sair){

        System.out.println("""
                
                
                Operações
                
                1- Consultar saldo
                2- Depósito
                3- Saque
                4- Sair
                """);
        int opcaoEscolhida = leitor.nextInt();


        switch (opcaoEscolhida){
            case 1:
                System.out.printf("O saldo atual é R$ %.2f%n", saldo);
                break;
            case 2:
                System.out.println("Informe o valor a depositar:");
                saldo += leitor.nextDouble();
                System.out.printf("O novo saldo é R$ %.2f%n", saldo);
                break;
            case 3:
                System.out.println("Informe o valor a sacar:");
                double valorSacar = leitor.nextDouble();
                if(saldo >= valorSacar) {
                    saldo -= valorSacar;
                    System.out.printf("O novo saldo é R$ %.2f%n", saldo);

                }
                else{
                    System.out.println("Saldo insuficiente!");
                }
                break;
            case 4:
                System.out.println("Programa finalizado:");
                sair = false;
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        }
    }
}

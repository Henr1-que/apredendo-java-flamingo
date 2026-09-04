package flamingo.apredendo.basico.EstruturasDeRepetiçao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int QuantidadeVendas = 0;
        double valor = 0.0;
        char continuar = 's';

        System.out.println("=== Sistema de Contador de Vendas ===");

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o valor da venda (R$): ");
            double valorVenda = scanner.nextDouble();


            QuantidadeVendas++;
            valor += valorVenda;

            System.out.print("Deseja outra venda? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("\n=== Resumo de Vendas ===");
        System.out.println("Total de vendas realizadas: " + QuantidadeVendas);
        System.out.println("Valor total arrecadado: R$ " + valor);

        scanner.close();
    }
}

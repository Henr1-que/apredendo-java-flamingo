package flamingo.apredendo.basico.EstruturasDeRepetiçao;

import java.util.Scanner;

public class Exercicio08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int QuantidadeProdutos = 5;
        double valorProduto = 20;
        char continuar = 's';
        System.out.println("=== Sistema de caixa registradora ===");
        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o valor do produto (R$): ");
            double valorVenda = sc.nextDouble();


            QuantidadeProdutos++;
            valorProduto += valorVenda;
        }

        System.out.println("Quantidade de produtos: 5 Valor de cada produto: R$ 20.0 Total da compra: R$ 100.0");


        sc.close();
    }
}

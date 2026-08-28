package flamingo.apredendo.basico.estrtuturasswitch;

import java.util.Scanner;

public class exercicio01 {
    static void main(String[] args) {

        // Switch Case (Escolha case)
        byte tipoCombustivel;
        double litros,preco;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Qual o tipo de combustivel?
                1) Gasolina
                2) Etanol
                3) diesel
                """);

       tipoCombustivel = sc.nextByte();

       switch (tipoCombustivel){
           case 1:
               System.out.println("Quantos litros de gasolina vc deseja?");
               litros = sc.nextDouble();
               preco = litros*5.89;

               System.out.printf("preço total do combustivel é R$%f", preco);
               break;
           case 2:
               System.out.println("Quantos litros de Etanol vc deseja?");
               litros = sc.nextDouble();
               preco = litros*3.99;

               System.out.printf("preço total do Etanol é R$%f", preco);
               break;
           case 3:
               System.out.println("Quantos litros de Diesel vc deseja?");
               litros = sc.nextDouble();
               preco = litros*6.19;

               System.out.printf("preço total do combustivel é R$%f", preco);
               break;
           default:
               System.out.println("nao existe essa opçao!");
       }
        sc.close();
    }
}

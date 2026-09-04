package flamingo.apredendo.basico.EstruturasDeRepetiçao;

import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        //while
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        int multiplicador = 1;
        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);

            multiplicador++;
        }
    }
}

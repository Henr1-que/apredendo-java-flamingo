package flamingo.apredendo.basico.exerciciosArrays;

import java.util.Scanner;

public class Exer03 {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i =0; i < numeros.length; i++){
            System.out.printf("Digite o &d", i + 1);
            numeros[i] = sc.nextInt();

            soma = soma +  numeros[i];
        }

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}

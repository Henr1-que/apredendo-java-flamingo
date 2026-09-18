package flamingo.apredendo.basico.exerciciosArrays;

import java.util.Scanner;

public class Exer05 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];


        for (int i = 0;i< numeros.length; i++){
            System.out.printf("Digite o %d numero: ", i + 1);
            numeros[i] = sc.nextInt();
        };

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        };

        System.out.println("Maior numero: " + maior);

        sc.close();
    }
}

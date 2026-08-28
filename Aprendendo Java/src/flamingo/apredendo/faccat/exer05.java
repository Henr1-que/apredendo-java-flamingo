package flamingo.apredendo.faccat;

import java.util.Scanner;

public class exer05 {

    //Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("programa antecessor");
        System.out.println("Digite um valor para saber seu antecessor:");
        int numero = sc.nextInt();
        int antecessor = numero - 1;

        System.out.println("0 numero antecessor do valor digitado é:" + antecessor);
        sc.close();
    }
}

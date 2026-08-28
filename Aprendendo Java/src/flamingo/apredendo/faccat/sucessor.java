package flamingo.apredendo.faccat;

import java.util.Scanner;

public class sucessor {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("programa sucessor");
        System.out.println("Digite um valor para saber seu sucessor:");
        int numero = sc.nextInt();
        int sucessor = numero + 1;

        System.out.println("0 numero sucessor do valor digitado é:" + sucessor);
        sc.close();
    }
}

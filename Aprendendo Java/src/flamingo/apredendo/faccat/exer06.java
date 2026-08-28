package flamingo.apredendo.faccat;

import java.util.Scanner;

public class exer06 {


    static void main() {
        double altura, base, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retangulo:");
        base = sc.nextDouble();

        System.out.println("digite a altura do retangulo:");
        altura = sc.nextDouble();

        area = base *altura;

        System.out.printf("A Area do retangulo = %.2f", area);
        sc.close();
    }
}

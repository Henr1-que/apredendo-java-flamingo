package flamingo.apredendo.faccat;

import java.util.Scanner;

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
public class exer07 {
    static void main() {
        byte idade,mes,dias;
        int diadeVida;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextByte();

        System.out.println("digite quantos meses adcionais:");
        mes = sc.nextByte();

        System.out.println("quantos dias adicionais?");
        dias = sc.nextByte();

         diadeVida = (idade* 365) + (mes*30) + dias;

        System.out.printf("Voce tem %d anos = %d dias de vida.", idade, diadeVida);
        sc.close();
    }
}

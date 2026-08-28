package flamingo.apredendo.faccat;

import java.util.Scanner;
//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores
public class exer08 {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
      double totalEleitores,votosBrancos,votosNulos,votosValidos;
        double percentualBrancos,percentualNulos,percentualValidos;


        System.out.println("digite o total de eleitores");
        totalEleitores =  sc.nextDouble();

        System.out.println("digite o total de votos brancos");
        votosBrancos = sc.nextDouble();

        System.out.println("digite o total de votos  nulos");
        votosNulos = sc.nextDouble();

        System.out.println("digite o total de votos validos ");
        votosValidos = sc.nextDouble();

        percentualBrancos = (votosBrancos * 100)/totalEleitores;
        percentualNulos = (votosNulos * 100)/totalEleitores;
        percentualValidos = (votosValidos * 100)/totalEleitores;

        System.out.printf("""
             ========= TOTAL DE %f VOTOS =========
             | Votos Brancos = %f%%          |
             | Votos Nulos = %f%%            |
             | Votos Valids = %f%%            |
             
             """, totalEleitores,percentualBrancos,percentualNulos,percentualValidos);
        sc.close();
    }
}

package flamingo.apredendo.basico.exerciciosArrays;

import java.util.Scanner;

public class Exer01 {
    static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i< nomes.length; i++){
            System.out.println("Digite o nome do aluno:");

            nomes[i]=sc.nextLine();
        }
        for (String nome : nomes){
            System.out.println(nome);
        }


        sc.close();
    }
}

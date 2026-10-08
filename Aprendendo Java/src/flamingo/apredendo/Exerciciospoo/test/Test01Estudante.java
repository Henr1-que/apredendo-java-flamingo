package flamingo.apredendo.Exerciciospoo.test;

import flamingo.apredendo.Exerciciospoo.dominio.estudante;

import java.util.Scanner;

public class Test01Estudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        estudante estudante = new estudante();

        System.out.println("Digite o nome do estudante:");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("Digite a idade do estudante:");
        int idade = Integer.parseInt(sc.nextLine());// NextLine pega  o dado do tipo string, Integer.parseint do string para number
        estudante.idade = idade;

        System.out.println("Digite o sexo do estudante:");
        String sexo = sc.nextLine();
       estudante.sexo = sexo;

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);;
        sc.close();
    }
}

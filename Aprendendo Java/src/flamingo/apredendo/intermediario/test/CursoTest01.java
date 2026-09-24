package flamingo.apredendo.intermediario.test;


import flamingo.apredendo.intermediario.dominio.Curso;

import java.util.Scanner;

public class CursoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Digite o nome do curso:");
        String nome = sc.nextLine();
        Curso.nome = nome;

        System.out.println("Digite a idade do estudante:");
        int idade = Integer.parseInt(sc.nextLine());// NextLine pega  o dado do tipo string, Integer.parseint do string para number
        Estudante.idade = idade;

        System.out.println("Digite o rg do estudante:");
        String rg = sc.nextLine();
        Estudante.rg = rg;

        System.out.println("Digite o Tel do estudante:");
        String tel = sc.nextLine();
        Estudante.tel = tel;

        System.out.println("Digite o curso do estudante:");
        String curso = sc.nextLine();
        Estudante.curso = curso;

        sc.close();
    }
}

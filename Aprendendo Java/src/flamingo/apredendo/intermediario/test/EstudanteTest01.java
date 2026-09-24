package flamingo.apredendo.intermediario.test;

import flamingo.apredendo.intermediario.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Estudante Estudante = new Estudante();

       System.out.println("Digite o nome do estudante:");
       String nome = sc.nextLine();
       Estudante.nome = nome;

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

       System.out.println(Estudante.nome);
       System.out.println(Estudante.idade);
       System.out.println(Estudante.rg);
       System.out.println(Estudante.tel);
       System.out.println(Estudante.curso);
       sc.close();
    }

}

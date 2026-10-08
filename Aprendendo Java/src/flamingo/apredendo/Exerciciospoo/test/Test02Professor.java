package flamingo.apredendo.Exerciciospoo.test;



import flamingo.apredendo.intermediario.dominio.Professor;

import java.util.Scanner;

public class Test02Professor {
    static void main() {
    Scanner sc = new Scanner(System.in);
    Professor Professor = new Professor();

        System.out.println("Digite o nome do Professor:");
    String nome = sc.nextLine();
    Professor.nome = nome;

        System.out.println("Digite a idade do Professor:");
    int idade = Integer.parseInt(sc.nextLine());// NextLine pega  o dado do tipo string, Integer.parseint do string para number
    Professor.idade = idade;

        System.out.println("Digite a Disciplina do Professor:");
    String Disciplina = sc.nextLine();
    Professor.Disciplina = Disciplina;

        System.out.println("Digite o Salario do estudante:");
    double salario = sc.nextDouble();
    Professor.salario = salario;


        System.out.println(Professor.nome);
        System.out.println(Professor.idade);
        System.out.println(Professor.Disciplina);
        System.out.println(Professor.salario);
        sc.close();
}
}

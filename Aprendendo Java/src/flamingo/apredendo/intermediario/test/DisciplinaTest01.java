package flamingo.apredendo.intermediario.test;


import flamingo.apredendo.intermediario.dominio.Disciplina;

import java.util.Scanner;

public class DisciplinaTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();

        System.out.println("Digite o nome da disciplina:");
        String nome = sc.nextLine();
        disciplina.nome = nome;

        System.out.println("Digite a carga horaria:");
        String cargaHoraria = sc.nextLine();
        disciplina.cargaHoraria = cargaHoraria;

        System.out.println("Digite a Disciplina do Professor:");
        String nomeProfessor = sc.nextLine();
        disciplina.nomeProfessor = nomeProfessor;

        System.out.println("Digite o semestre da disciplina:");
        int Semestre = sc.nextInt();
        disciplina.semestre = disciplina.semestre;


        System.out.println(disciplina.nome);
        System.out.println(disciplina.cargaHoraria);
        System.out.println(disciplina.nomeProfessor);
        System.out.println(disciplina.semestre);
        sc.close();
    }
}

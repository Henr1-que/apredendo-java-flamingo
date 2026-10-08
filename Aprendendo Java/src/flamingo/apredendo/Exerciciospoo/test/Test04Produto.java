package flamingo.apredendo.Exerciciospoo.test;

import flamingo.apredendo.Exerciciospoo.dominio.produto;

import java.util.Scanner;

public class Test04Produto {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        produto Produto = new produto();

        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();
        produto.nome = nome;

        System.out.println("Digite o preço:");
        double preco = sc.nextDouble();
        produto.preco = preco;

        System.out.println("Digite a quantidade de Produtos:");
        int quantidade = sc.nextInt();
        produto.quantidade = quantidade;
    }
}

package flamingo.apredendo.basico;

import java.util.Scanner;

public class EstruturasCondicionaisParte04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Switch Case (Escolha case)
        System.out.println("Digite um numero de 1 a 7");
        int diaSemana = sc.nextInt();
        String resultado;

        switch (diaSemana){
            case 1:
            resultado = "Domingo";
            break;
            case 2:
             resultado ="Segunda-feira";
             break;
            case 3:
                resultado ="Terça-feira";
                break;
            case 4:
                resultado ="Quarta-feira";
                break;
            case 5:
                resultado ="Quinta-feira";
                break;
            case 6:
                resultado ="Sexta-feira";
                break;
            case 7:
                resultado ="Sábado";
                break;
            default:
                resultado = "Dia inválido!";
                break;
        }
        System.out.println(resultado);
        sc.close();
    }
}

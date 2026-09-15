package flamingo.apredendo.faccat;

import javax.swing.*;

public class exer05IG {
    JFrame quadroAviso;


    exer05IG(){
        quadroAviso = new JFrame();
        JOptionPane.showMessageDialog(quadroAviso,"Programa antecessor");
        String numero = JOptionPane.showInputDialog("Digite um numero para descobrir seu antecessor:");
        int Valor = Integer.parseInt(numero);
        int antecessor = Valor - 1;
        JOptionPane.showMessageDialog(quadroAviso,"O valor antecessor do numero digitado é: " +antecessor);
}


    static void main(String[] args) {

     new exer05IG();


    }
}

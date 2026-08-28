package flamingo.apredendo.basico;

public class operadoresParte3 {
    static void main(String[] args) {
        /*
        * && AND -> E
        * || OR - > OU
        * ! NOT - > NAO
        *  */

        byte idade = 18;
        boolean isCNH = true;

        boolean isEstaNaLeiparaDirigir = idade >= 18 && isCNH== true;

        System.out.println(isEstaNaLeiparaDirigir);
    }
}

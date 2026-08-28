package flamingo.apredendo.basico;

public class operadoresParte05 {
    static void main(String[] args) {
        // Operadores de atribuicao


        /*
        * = atribuicao simples
        * -= subtraçao e atribuicao
        * *= multiplicaçao e atribuicao
        *
        * */

        double totalCompra = 0;



        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50;

        totalCompra /= 2;
        System.out.printf("Total da compra = %.2f", totalCompra);
    }
}

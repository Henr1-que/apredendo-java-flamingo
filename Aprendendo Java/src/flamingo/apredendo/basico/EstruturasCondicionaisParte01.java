package flamingo.apredendo.basico;

public class EstruturasCondicionaisParte01 {
    static void main(String[] args) {

        byte idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // true
        if (isAutorizadoComprarBebida){
            System.out.println("pode comprar bebida acoolica");
        }
    }
}

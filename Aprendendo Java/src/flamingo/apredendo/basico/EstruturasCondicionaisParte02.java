package flamingo.apredendo.basico;

public class EstruturasCondicionaisParte02 {
    static void main(String[] args) {

   //    byte idade = 17;

    //   if(idade>= 18){
    //       System.out.println("Pode comprar Bebida Acoolica");
    //   }else {
    //       System.out.println("nao pode comprar bebida acoolica");
    //   }

        byte idade =  16;
        String categoria;
        //< 15 - infantil
        //< - 15 && < 18
        //>= 18 - Adulto

        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade < 18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}

package flamingo.apredendo.basico;

public class ArraysParte02 {
    static void main(String[] args) {
        int i = 0;
       String[] nomes = new String[4];
        nomes = new String[5];
       nomes[0] = "Yuri Alberto";
       nomes[1] = "Memphis Depay";
       nomes[2] = "Rodrigo Garro";
       nomes[3] = "Hugo Souza";
       nomes[4] = "Breno Bidon";
        while (i < nomes.length){
            System.out.println(nomes[i]);
            i++;
        }




    }
}

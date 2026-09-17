package flamingo.apredendo.basico;

public class ArraysParte05 {
    public static void main(String[] args) {
        int[][] diasDosMeses = new int[12][];

        diasDosMeses[0] = new int[31]; // Janeiro
        diasDosMeses[1] = new int[28]; // Fevereiro
        diasDosMeses[2] = new int[31]; // Março
        diasDosMeses[3] = new int[30]; // Abril
        diasDosMeses[4] = new int[31]; // Maio
        diasDosMeses[5] = new int[30]; // Junho
        diasDosMeses[6] = new int[31]; // Julho
        diasDosMeses[7] = new int[31]; // Agosto
        diasDosMeses[8] = new int[30]; // Setembro
        diasDosMeses[9] = new int[31]; // Outubro
        diasDosMeses[10] = new int[31]; // Novembro
        diasDosMeses[11] = new int[30]; // Dezembro

        for (int i = 0; i < diasDosMeses.length; i++) {
            for (int j = 0; j < diasDosMeses[i].length; j++) {
             diasDosMeses[i][j] = j + 1;
                System.out.println(diasDosMeses[i][j]);
            }
        }
     for(int[] diasDoMes : diasDosMeses){
         for(int dia : diasDoMes){
             System.out.println("Dia " + dia);
         }
         System.out.println("-----------------------------------");
     }
    }
    }
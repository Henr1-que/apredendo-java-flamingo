package flamingo.apredendo.introducao;

public class tiposPrimitivos {

    public static void main(String[] args) {
       //byte : -128 a 127
        // short: -32.768 a 32.767
        // int: -2 bilhões a 2 bilhões
        // long: Ocupa 64 bits. Para números inteiros muito grandes. Usa um L no final do valor
        //float: precisao simples
        //double: precisao dupla
        //char:
        short idade = 18;
        int municipio = 114000000;
        long contaBancaria = 9999999999999L;
        float salario = 15000.66f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'R';
        boolean VaiestudarNasFerias = false;
        System.out.println("Primeira letra do meu nome é " +primeiraLetraDoNome);
        System.out.println("PL Caiu = " + salarioExtra);
        System.out.println("Meu salario dps de estudar com o bigas é" +salario);
        System.out.println("Minha idade é "+ idade);
        System.out.println("são paulo(SP): Mais de "+ municipio + "milhoes de moradores.");
        System.out.println("Minha conta bancaria daqui a 5 anos " + contaBancaria);
    }
}

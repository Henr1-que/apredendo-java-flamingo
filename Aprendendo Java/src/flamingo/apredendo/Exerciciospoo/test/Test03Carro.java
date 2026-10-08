package flamingo.apredendo.Exerciciospoo.test;

import flamingo.apredendo.intermediario.dominio.carro;

public class Test03Carro {
    static void main() {
        carro carro1 = new carro();
        carro carro2 = new carro();

        carro1.nome = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 1999;

        carro2.nome = "Gol";
        carro2.marca = "Volkswagen";
        carro2.ano = 2015;

        System.out.printf("""
                Carro 01
                nome: %s
                marca:%s
                ano:%d
                
                ---------------------
                
                Carro 02
                nome: %s
                marca:%s
                ano:%d
           """,carro1.nome,carro1.marca, carro1.ano,carro2.nome,carro2.marca,carro2.ano);
    }
    }


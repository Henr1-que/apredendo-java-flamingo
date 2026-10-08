package flamingo.apredendo.Exerciciospoo.test;


import flamingo.apredendo.Exerciciospoo.dominio.livro;

public class Test05Livro {
   void main(String[] args) {
        livro livro1 = new livro();
        livro livro2 = new livro();

        livro1.titulo = "A Revolução dos Bichos";
        livro1.autor = "George Orwell";
        livro1.numeroPaginas = 160;
        livro1.preco = 20;

        livro2.titulo = "Biblia Sagrada";
        livro2.autor = "Deus";
        livro2.numeroPaginas = +1000;
        livro2.preco = 150;

        System.out.printf("""
                livro 01
                titulo:%s
                autor:%s
                numeroPaginas:%d
                preço:%s
                ---------------------
               livro 02
               titulo:%s
                autor:%s
                numeroPaginas:%d
                preço:%s
                
           """,livro1.titulo,livro1.autor,livro1.numeroPaginas,livro1.preco,livro2.titulo,livro2.autor, livro2.numeroPaginas,livro2.preco);
    }
}

public class RegistroDeVendas {
    
    public static void main(String[] args) {
        
        // Autor é um tipo de dado, assim como uma classe é um tipo de dado. autor é um objeto
        Autor autor = new Autor();

        // O objeto abaixo autor é uma instancia de uma classe
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development - TDD");
        fisico.setValor(59.90);
        fisico.aplicaDescontoDe15Porcento();

        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Object Oriented Programming - OOP");
        ebook.setValor(29.90);


        MiniLivro miniLivro = new MiniLivro(autor);
        miniLivro.setNome("O melhor mini livro do mundo");
        miniLivro.setValor(29.90);
        miniLivro.aplicaDesconto10Porcento();

        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        System.out.println("O valor do Livro Fisico com desconto é: " + fisico.getValor());

        // Método que adiciona um livro ao carrinho
        carrinho.adiciona(miniLivro);
        carrinho.adiciona(fisico);  
        carrinho.adiciona(ebook); 


        System.out.println("O valor total é: " + carrinho.getTotal());
        // Como estamos imprimindo o objeto inteiro e não um de seus atributos, o comportamento padrão é mostrar o nome da classe mais um @codigoEstranho
    }
}

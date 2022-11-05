public class RegistroDeVendas {
    
    public static void main(String[] args) {
        
        // Autor é um tipo de dado, assim como uma classe é um tipo de dado. autor é um objeto
        Autor autor = new Autor();

        // O objeto abaixo autor é uma instancia de uma classe
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development - TDD");
        fisico.setValor(59.90);

        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Object Oriented Programming - OOP");
        ebook.setValor(29.90);

        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        // Método que adiciona um livro ao carrinho
        carrinho.adiciona(fisico);  
        carrinho.adiciona(ebook); 

        System.out.println("Total: " + carrinho.getTotal());

        // Como estamos imprimindo o objeto inteiro e não um de seus atributos, o comportamento padrão é mostrar o nome da classe mais um @codigoEstranho
    }
}

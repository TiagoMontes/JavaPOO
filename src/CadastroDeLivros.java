public class CadastroDeLivros {
    public static void main(String[] args) {

        // Abaixo estamos criando um objeto do tipo Autor - Autor é um tipo de dado e autor é um objeto
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");


        // Abaixo estamos criando um objeto do tipo LivroFisico - LivroFisico é um tipo de dado e fisico é um objeto - o parametro autor serve para passar o objeto autor para o construtor da classe LivroFisico já que o construtor da classe LivroFisico pede um objeto do tipo Autor
        Livro livro = new Livro(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90); 
        livro.setImpresso(false);


        // Abaixo estamos criando um objeto do tipo Ebook - Ebook é um tipo de dado e ebook é um objeto
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Prático");
        ebook.setAutor(autor);
        ebook.setValor(59.90);
        ebook.setDescricao("Novos recursos da linguagem");
        
        ebook.aplicaDescontoDe(0.15); // Estamos aplicando um desconto de 15% no objeto ebook
        ebook.mostrarDetalhes();

        livro.aplicaDescontoDe(0.30); // Estamos aplicando um desconto de 30% no objeto livro
        livro.mostrarDetalhes();

        //----------------------------------------------

        // Autor outroAutor = new Autor();
        // outroAutor.setNome("Paulo Silveira");
        // outroAutor.setEmail("paulo.silveira@caelum.com.br");
        // outroAutor.setCpf("123.456.789-10");

        // Livro outroLivro = new Livro(outroAutor);
        // outroLivro.setNome("Logica da Programação");
        // outroLivro.setDescricao("Crie seus primeiros programas");
        // outroLivro.setValor(59.90);
        // outroLivro.setImpresso(true);

        // outroLivro.aplicaDescontoDe(0.3);
        // outroLivro.setAutor(outroAutor);

        // outroLivro.mostrarDetalhes();
    }
    
}
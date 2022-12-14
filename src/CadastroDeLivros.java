public class CadastroDeLivros {
    public static void main(String[] args) {

        // Abaixo estamos criando um objeto do tipo Autor - Autor é um tipo de dado e autor é um objeto
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");

        // Abaixo estamos criando um objeto do tipo LivroFisico - LivroFisico é um tipo de dado e fisico é um objeto - o parametro autor serve para passar o objeto autor para o construtor da classe LivroFisico já que o construtor da classe LivroFisico pede um objeto do tipo Autor
        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Java 8 Prático - Fisico");
        livroFisico.setDescricao("Novos recursos da linguagem");
        livroFisico.setValor(59.90);

        // Abaixo estamos criando um objeto do tipo Ebook - Ebook é um tipo de dado e ebook é um objeto
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Prático - Digital");
        ebook.setValor(59.90);
        ebook.setDescricao("Novos recursos da linguagem");

        MiniLivro miniLivro = new MiniLivro(autor);
        miniLivro.setNome("Java 8 Prático - Mini");
        miniLivro.setValor(39.90);
        miniLivro.setDescricao("Novos recursos da linguagem");

        ebook.aplicaDescontoDe(0.15); // Estamos aplicando um desconto de 15% no objeto ebook
        ebook.mostrarDetalhes();

        livroFisico.aplicaDescontoDe(0.30); // Estamos aplicando um desconto de 30% no objeto livro
        livroFisico.mostrarDetalhes();

        miniLivro.aplicaDescontoDe(0.30); // Estamos aplicando um desconto de 30% no objeto miniLivro
        miniLivro.mostrarDetalhes();

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
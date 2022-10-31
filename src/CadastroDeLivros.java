public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");
        
        livro.setAutor(autor);
        
        livro.mostrarDetalhes();

        //----------------------------------------------

        Livro outroLivro = new Livro();
        outroLivro.setNome("Logica da Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789-10");

        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();
    }
    
}
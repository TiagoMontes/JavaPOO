public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");

        Livro livro = new Livro(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setImpresso(false);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Prático"); // Como a classe Livro possui o atributo nome e o setter, não é necessário criar um novo atributo/setter na classe Ebook
        ebook.setAutor(autor);
        ebook.setDescricao("Novos recursos da linguagem");
        
        livro.aplicaDescontoDe(0.16);
        livro.mostrarDetalhes();

        //----------------------------------------------

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789-10");

        Livro outroLivro = new Livro(outroAutor);
        outroLivro.setNome("Logica da Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setImpresso(true);

        outroLivro.aplicaDescontoDe(0.3);
        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();
    }
    
}
public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        
        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789-10";
        
        livro.autor = autor;
        
        livro.aplicaDescontoDe(0.1);
        livro.mostrarDetalhes();

        //----------------------------------------------

        Livro outroLivro = new Livro();
        outroLivro.nome = "Logica da programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789-10";

        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();

        //----------------------------------------------
        Livro livro3 = new Livro();
        livro3.nome = "O segredo da cabana";
        livro3.descricao = "Um livro de auto ajuda pra sobreviver";
        livro3.valor = 59.90;
        livro3.isbn = "978-85-66250-22-0";

        Autor autor3 = new Autor();
        autor3.email = "umMaluco.qualquer@gemail.com";
        autor3.cpf = "123.456.789-10";

        livro3.autor = autor3;

        livro3.mostrarDetalhes();
    }
    
}
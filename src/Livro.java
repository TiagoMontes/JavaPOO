public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn; // International Standard Book Number
    private Autor autor; // Agora o livro tem um autor

    boolean temAutor() {
        boolean naoEhNull = this.autor.getNome() != null;
        return naoEhNull;
    }

    void mostrarDetalhes() {
        String messageLivro = "Mostrando detalhes do livro ";

        System.out.println(messageLivro);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("-");
        autor.mostrarDetalhes();
        System.out.println("-----");

        if (this.temAutor()) {
            System.out.println("Esse é um método com return e possui o nome do autor: " + this.autor.getNome());
            System.out.println("-----");
        } else {
            System.out.println("Esse é um método com return e não possui o nome do autor");
            System.out.println("-----");
        }
    }

    public boolean aplicaDescontoDe(double porcentagem) {

        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;

    }

    // Isolando comportamento
    // Como esse método não recebe parametro, ele não precisa de this
    double getValor() {
        return valor;
    }

    void setValor(double valor) {
        this.valor = valor;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getDescricao() {
        return descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String getIsbn() {
        return isbn;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    Autor getAutor() {
        return autor;
    }

    void setAutor(Autor autor) {
        this.autor = autor;
    }


    

}
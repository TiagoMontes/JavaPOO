public class Livro{

    private String nome;
    private String descricao;
    private double valor;
    private String isbn; // International Standard Book Number
    private Autor autor; // Agora o livro tem um autor
    private Boolean impresso;

    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0"; // Valor padrão
        this.impresso = true;
    }

    // Desta forma podemos criar o livro passando ou não um autor
    // public Livro() {

    // }

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
        if (this.impresso == true) {
            System.out.println("Este livro é impresso");
        } else {
            System.out.println("Este livro é digital");
        }

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
        } else if (!this.impresso && porcentagem > 0.15) {
            return false;
        } else {
            this.valor -= this.valor * porcentagem;
            return true;
        }

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

    Boolean getImpresso() {
        return impresso;
    }

    void setImpresso(Boolean impresso) {
        this.impresso = impresso;
    }
    

}
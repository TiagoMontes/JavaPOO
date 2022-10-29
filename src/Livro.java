public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn; // International Standard Book Number
    Autor autor; // Agora o livro tem um autor

    boolean temAutor() {
        boolean naoEhNull = this.autor.nome != null;
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
            System.out.println("Esse é um método com return e possui o nome do autor: " + this.autor.nome);
            System.out.println("-----");
        } else {
            System.out.println("Esse é um método com return e não possui o nome do autor");
            System.out.println("-----");
        }
    }

    public void aplicaDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }
}
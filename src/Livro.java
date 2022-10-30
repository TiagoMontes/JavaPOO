public class Livro {

    private String nome;
    String descricao;
    private double valor;
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
            System.out.println("Esse é um método com return e possui o nome do autor: " + this.retornaNome());
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
    void adicionarValor(double valor) {
        this.valor += valor;
    }

    // Como esse método não recebe parametro, ele não precisa de this
    double retornaValor() {
        return valor;
    }

    void adicionarNome(String nome) {
        this.nome = nome;
    }

    String retornaNome() {
        return nome;
    }

}
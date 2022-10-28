public class Livro {
    // Atributos - São assim chamados pois estão dentro da classe e não dentro de um método (main)
    String nome;
    String descricao;
    double valor;
    String isbn; // International Standard Book Number
    Autor autor; // Agora o livro tem um autor

    // Abaixo temos um método construtor, que é um método especial que é chamado quando criamos um objeto
    // // Seu tipo é o nome da classe
    // public static void main(String[] args) {

    //     Livro livro = new Livro();
    //     livro.nome = "Java 8 Prático";
    //     livro.descricao = "Novos recursos da linguagem";
    //     livro.valor = 59.90;
    //     livro.isbn = "978-85-66250-46-6";

    //     System.out.println("O nome do livro é " + livro.nome);
    // }

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
        // Vamos usar a palavra reservada this para mostrar que esse é o atributo da classe e não o parâmetro do método. Ainda que seja opcional, é uma boa prática usar o this para diferenciar os atributos da classe dos parâmetros do método.
        this.valor -= this.valor * porcentagem;
    }
}
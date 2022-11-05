// uma classe é um tipo de dado
public class Livro{

    //Atributos - São as características do objeto
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor; // Agora o livro tem um autor do tipo Autor
    private Boolean impresso;

    public Livro(Autor autor) { // Construtor - O construtor é um método que tem o mesmo nome da classe e não tem retorno. Ele é chamado quando instanciamos um objeto. O construtor é usado para inicializar os atributos do objeto.
        this.autor = autor; // 
        this.isbn = "000-00-00000-00-0";
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
        System.out.println("O nome deste ebook é " + this.getNome());

        if (this.impresso == true) {
            System.out.println("Este livro é impresso");
        } else {
            System.out.println("Este livro é digital");
        }

        if (this.temAutor()) {
            System.out.println("Esse é um método com return e possui o nome do autor: " + this.autor.getNome()); // Acessando o atributo autor através do construtor Livro e o método getNome() da classe Autor
            System.out.println("-----");
        } else {
            System.out.println("Esse é um método com return e não possui o nome do autor");
            System.out.println("-----");
        }

    }

    // Este método EXIGE um retorno.
    public boolean aplicaDescontoDe(double porcentagem) {

        if (porcentagem > 0.3) {
            return false;
        } else {
            this.valor -= this.valor * porcentagem;
            System.out.println("Aplicando desconto no Livro");
            return true;
        }

    }

    // Getters serve para retornar o valor de um atributo, e Setter serve para alterar o valor de um atributo. Usamos o Getters e Setters para proteger os atributos da classe já que eles são privados.

    // Isolando comportamento
    // Métodos getters não recebem parâmetros
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
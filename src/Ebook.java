public class Ebook extends Livro { // Herança - estamos dizendo que a classe Ebook é uma extensão da classe Livro e assim, herda todos os atributos e métodos da classe Livro

    private String waterMark;

    public Ebook(Autor autor) { // construtor da classe Ebook que está recebendo como parâmetro um objeto do tipo Autor, obrigando que o objeto seja criado com um autor
        super(autor); // Chama o construtor da classe pai
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }

    @Override // Sobrescrevendo o método da classe pai
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        } else {
            System.out.println("Aplicando desconto no Ebook");
            return super.aplicaDescontoDe(porcentagem); // com Super eu chamo o método da classe pai
        }
    }

}

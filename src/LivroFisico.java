public class LivroFisico extends Livro implements Promocional {
    
    // Estamos estendendo de Livro pois se fizessemos em Livro, Ebook estaria recebendo o método também, e não queremos isso ja que o Ebook não tem taxa de impressão
    
    // Construtor da classe
    public LivroFisico(Autor autor) {
        super(autor); // Super chama autor da classe pai que serve para instanciar um objeto do tipo Autor
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.30) {
            return false;
        } else {
            double desconto = this.getValor() * porcentagem;
            System.out.println("Aplicando desconto no Livro Físico");
            this.setValor(this.getValor() - desconto);
            return true;
        }
    }
}

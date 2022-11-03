public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
        this.impresso = false;
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
            this.valor -= this.valor * porcentagem;
            return true;
        }
    }

}

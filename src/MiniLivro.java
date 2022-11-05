public class MiniLivro extends Livro{
    
    public MiniLivro(Autor autor) {
        super(autor);
    }

    public double getValor() {
        return 0;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}

public class MiniLivro extends Livro implements Promocional {
    
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        System.out.println("Não pode existir desconto");
        return false;
    }
}

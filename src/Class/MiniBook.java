package Class;

import Interface.Promotional;

public class MiniBook extends Book implements Promotional {

    public MiniBook(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percentage) {
        System.out.println("Não pode existir desconto para mini livros");
        return false;
    }
}

package Class;
import Interface.Promotional;

public class PrintBook extends Book implements Promotional {

    public PrintBook(Author author) {
        super(author);
    }

    public double getPrintTax() {
        return this.getValue() * 0.05;
    }

    @Override
    public boolean applyDiscount(double percentage) {
        if (percentage > 0.30) {
            return false;
        } else {
            double discount = this.getValue() * percentage;
            System.out.println("Aplicando desconto no Livro Físico");
            this.setValue(this.getValue() - discount);
            return true;
        }
    }
}

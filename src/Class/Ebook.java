package Class;
import Interface.Promotional;

public class Ebook extends Book implements Promotional {
    private String waterMark;

    public Ebook(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percentage) {
        if (percentage > 0.15) {
            return false;
        } else {
            double discount = this.getValue() * percentage;
            System.out.println("Aplicando desconto no Entity.Ebook");
            this.setValue(this.getValue() - discount);
            return true;
        }
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }
}

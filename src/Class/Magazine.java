package Class;
import Interface.Product;
import Interface.Promotional;

public class Magazine implements Product, Promotional {
    
    private String name;
    private String description;
    private double value;
    private Publisher publisher;


    public String getName() {
        return name;
    }

    void setName(String nome) {
        this.name = nome;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    void setValor(double valor) {
        this.value = valor;
    }

    Publisher getPublisher() {
        return publisher;
    }

    void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public boolean applyDiscount(double percentage) {
        if (percentage > 0.1) {
            return false;
        } else {
            double discount = this.getValue() * percentage;
            setValor(getValue() - discount);
            return true;
        }
    }

}

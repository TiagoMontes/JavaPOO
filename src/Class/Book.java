package Class;
import Interface.Product;

public abstract class Book implements Product {

    private String name;
    private String description;
    private double value;
    private String isbn;
    private Author author;

    public Book(Author author) {
        this.author = author; 
        this.isbn = "000-00-00000-00-0";
    }

    public boolean hasAuthor() {
        return this.author.getName() != null;
    }

    public void  showDetails() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.println("Valor: " + value);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");
        getAuthor().showDetails();
        System.out.println("-----");

        if (this.hasAuthor()) {
            System.out.println("Esse é um método com return e possui o nome do autor: " + getAuthor().getName());
            System.out.println("-----");
        } else {
            System.out.println("Esse é um método com return e não possui o nome do autor");
            System.out.println("-----");
        }

    }

    public abstract boolean applyDiscount(double percentage);

    public double getValue() {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
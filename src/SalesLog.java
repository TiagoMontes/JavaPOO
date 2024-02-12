import Class.*;

public class SalesLog {
    
    public static void main(String[] args) {

        Author author = new Author();

        author.setName("Mauricio Aniche");

        PrintBook printBook = new PrintBook(author);
        printBook.setName("Test-Driven Development - TDD");
        printBook.setValue(59.90);
        printBook.apply15PercentDiscount();

        
        Ebook ebook = new Ebook(author);
        ebook.setName("Object Oriented Programming - OOP");
        ebook.setValue(29.90);


        MiniBook miniBook = new MiniBook(author);
        miniBook.setName("O melhor mini livro do mundo");
        miniBook.setValue(29.90);
        miniBook.apply10PercentDiscount();

        
        ShoppingCart shoppingCart = new ShoppingCart();
        
        System.out.println("O valor do Livro Fisico com desconto é: " + printBook.getValue());

        shoppingCart.add(miniBook);
        shoppingCart.add(printBook);
        shoppingCart.add(ebook);


        System.out.println("O valor total é: " + shoppingCart.getTotal());
    }
}

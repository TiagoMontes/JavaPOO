public class BookRegister {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");
        author.setEmail("rodrigo.turini@caelum.com.br");
        author.setCpf("123.456.789-10");

        PrintBook printBook = new PrintBook(author);
        printBook.setName("Java 8 Prático - Fisico");
        printBook.setDescription("Novos recursos da linguagem");
        printBook.setValue(59.90);

        Ebook ebook = new Ebook(author);
        ebook.setName("Java 8 Prático - Digital");
        ebook.setValue(59.90);
        ebook.setDescription("Novos recursos da linguagem");

        MiniBook miniBook = new MiniBook(author);
        miniBook.setName("Java 8 Prático - Mini");
        miniBook.setValue(39.90);
        miniBook.setDescription("Novos recursos da linguagem");

        ebook.applyDiscount(0.15);
        ebook.showDetails();

        System.out.println();

        printBook.applyDiscount(0.30);
        printBook.showDetails();

        System.out.println();

        miniBook.applyDiscount(0.30);
        miniBook.showDetails();
    }
    
}
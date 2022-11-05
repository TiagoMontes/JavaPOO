public class RegrasDeDesconto {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor(); // 1 - Instanciando um objeto do tipo Autor
        autor.setNome("Rodrigo Turini"); // 2 - Atribuindo valores aos atributos do objeto

        Livro livro = new LivroFisico(autor); // 3 - Instanciando um objeto do tipo Livro
        livro.setValor(59.90); // 4 - Atribuindo valores aos atributos do objeto

        if (!livro.aplicaDescontoDe(0.3)) { 
            System.out.println("Desconto no livro não pode ser maior do que 30%");
        } else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook(autor); // 5 - Instanciando um objeto do tipo Ebook
        ebook.setValor(29.90); // 6 - Atribuindo valores aos atributos do objeto

        if (!ebook.aplicaDescontoDe(0.15)) {
            System.out.println("Desconto no ebook não pode ser maior do que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }
    }

}
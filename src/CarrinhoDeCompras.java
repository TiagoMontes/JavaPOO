public class CarrinhoDeCompras {
    
    // Fizemos dessa forma pois tanto LivroFisico quanto Ebook são filhos da classe Livro. Desta forma, quando trazemos como parametro um Livro, podemos passar tanto um LivroFisico quanto um Ebook (2 extensões da classe Livro)
    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
    }
}

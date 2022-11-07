public class CarrinhoDeCompras {
    
    private double total;

    // Fizemos dessa forma pois tanto LivroFisico quanto Ebook são filhos da classe Livro. Desta forma, quando trazemos como parametro um Livro, podemos passar tanto um LivroFisico quanto um Ebook (2 extensões da classe Livro) - Isso se chama Polimorfismo
    public void adiciona(Produto produto)  {
        System.out.println("Adicionando: " + produto);
        // produto.aplicaDescontoDe(0.15); Nem todo Produto tem o método aplicaDescontoDe, mas apenas os filhos da classe Livro // quando chamamos o método aplicaDescontoDe, ele vai verificar se o livro é um LivroFisico ou Ebook e aplicar o desconto correspondente.
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}

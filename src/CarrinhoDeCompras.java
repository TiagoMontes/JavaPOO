public class CarrinhoDeCompras {
    
    private double total;

    // Fizemos dessa forma pois tanto LivroFisico quanto Ebook são filhos da classe Livro. Desta forma, quando trazemos como parametro um Livro, podemos passar tanto um LivroFisico quanto um Ebook (2 extensões da classe Livro) - Isso se chama Polimorfismo
    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro.getNome());
        livro.aplicaDescontoDe(0.15); // quando chamamos o método aplicaDescontoDe, ele vai verificar se o livro é um LivroFisico ou Ebook e aplicar o desconto correspondente.
        total += livro.getValor();
    }

    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " + revista.getNome());
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }

    public double getTotal() {
        return total;
    }
}

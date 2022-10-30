public class RegrasDeDesconto {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        livro.adicionarValor(59.90);

        System.out.println("Valor atual é: " + livro.retornaValor());

        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto é: " + livro.retornaValor());
        }
    }

}

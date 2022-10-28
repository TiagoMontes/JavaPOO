public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        // double livroJava8 = 59.90;
        // double livroTDD = 59.90;
        // o recurso abaixo se chama casting, ou seja, forçar o tipo de uma variável
        // int numeroInteiro = (int) livroJava8;

        // double soma = livroJava8 + livroTDD;
        // System.out.println("O total em estoque é de " + soma);
        // System.out.println("O numero inteiro é " + numeroInteiro);

        // if (soma < 150) {
        //     System.out.println("Seu estoque está muito baixo!");
        // } else if (soma >= 2000) {
        //     System.out.println("Seu estoque está muito alto!");
        // } else {
        //     System.out.println("Seu estoque está bom!");
        // }

        //Pode usar ordenador ternário para fazer o if acima
        // String value = livroJava8 == livroTDD ? "Os livros possuem os mesmos valores" : "Os livros não possuem os mesmos valores";
        // System.out.println(value);

        // double soma = 0;
        //opcao limpa
        // for (int i = 0; i < 35; i++) {
        //     soma += 59.90;
        // }
        // System.out.println("O total em estoque é de " + soma);

        // if (soma < 150) {
        //     System.out.println("Seu estoque está muito baixo!");
        // } else if (soma >= 2000) {
        //     System.out.println("Seu estoque está muito alto!");
        // } else {
        //     System.out.println("Seu estoque está bom!");
        // }

        //2. opcao
        // while (contador < 35) {
        //     double valorDoLivro = 59.90;
        //     soma += valorDoLivro;
        //     contador ++;
        // }
        // System.out.println("O total em estoque é de " + soma);

        // continue e break
        // for (int i = 0; i < 10; i++) {
        //     if (i == 7) {
        //         // continue pula para a proxima iteração
        //         continue;

        //         // break sai do laço
        //         // break;
        //     }
        //     System.out.println(i);
        // }


        int v1 = 5;
        int v2 = 8;
        int v3 = 10;
        // ao inves de usar encadeamento de ifs, vamos fazer o seguinte
        if (v1 > v2 && v2 < v3) {
            //se for maior que v1 e menor que v3, true
        }


        //podemos negar uma condição usando o !
        boolean condição = 1 > 0;
        if (!condição) {
            //se a condição for falsa, entra aqui
        }
    }
}
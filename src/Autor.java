public class Autor {
    // Não colocaremos em na class Livro pois essas novas informações pertencem ao autor do livro e não ao livro em si. Se o autor é um elemento importante para nosso sistema, ele pode e deve ser representado como um objeto.

    String nome;
    String email;
    String cpf;

    //Podemos adicionar na classe Livro um atributo do tipo Autor. Uma classe pode ter outra classe como atributo. Esse é um processo chamado de composição

    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}

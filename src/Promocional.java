interface Promocional {

    boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe15Porcento() {
        return aplicaDescontoDe(0.15);
    };
    //Acima nosso método possui default, e dessa forma, toda classe que implementar a interface Promocional terá um novo método aplicaDesconto10Porcento() sem a obrigação de implementar qualquer linha de código.

    // LivroFisico, Ebook, MiniLivro estão implementando a interface Promocional, e Revista também está implementando a interface Produto. Estamos DIMINUINDO ACOPLAMENTO COM INTERFACES (ja que estariamos fazendo cagada caso usássemos herança para resolver a questão de desconto para cada tipo de produto)
}
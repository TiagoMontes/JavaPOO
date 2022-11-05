public class Revista implements Produto{
    
    private String nome;
    private String descricao;
    private double valor;
    private String editora;

    // Setters e Getters
    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getDescricao() {
        return descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    void setValor(double valor) {
        this.valor = valor;
    }

    String getEditora() {
        return editora;
    }

    void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        } else {
            double desconto = this.getValor() * porcentagem;
            setValor(getValor() - desconto);
            return true;
        }
    }

    @Override
    public double getValor() {
        // TODO Auto-generated method stub
        return valor;
    }

}

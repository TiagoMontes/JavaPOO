// Uma interface é um tipo de classe que contém apenas constantes e métodos abstratos.
public interface Produto {
    
    double getValor(); // O modificador abstract é opcional, já que todo método sem corpo de uma interface é abstrato. Não precisamos adicionar o modificador public, já que todos os métodos de uma interface são públicos.
}

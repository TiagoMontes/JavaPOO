// Interface é um contrato que estabelece as obrigações que todas as classes que assinam esse contrato precisam cumprir. É isto
@FunctionalInterface
public interface Produto {
    
    double getValor(); // O modificador abstract é opcional, já que todo método sem corpo de uma interface é abstrato. Não precisamos adicionar o modificador public, já que todos os métodos de uma interface são públicos.
}

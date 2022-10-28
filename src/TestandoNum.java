public class TestandoNum {
    
    public static void main(String[] args) {
        // Para representar numeros inteiros podemos usar int, short, long, byte.
        // Para numeros decimais usamos double e float.
        double numero = 4;
        double outroNumero = numero;
        numero = numero + 5.6;

        String texto = "Olá mundo, o número inteiro é " + numero + " e o outro número é " + outroNumero;

        System.out.println(numero);
        System.out.println(outroNumero);
        System.out.println(texto);
    }
}

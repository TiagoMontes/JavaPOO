public class ShoppingCart {
    
    private double total;

    public void add(Product product)  {
        System.out.println("Adicionando: " + product);
        total += product.getValue();
    }

    public double getTotal() {
        return total;
    }
}

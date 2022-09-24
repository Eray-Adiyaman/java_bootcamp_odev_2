public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = "laptop";
        product.id=1;
        product.description="Asus laptop";
        product.price=10000;
        product.stockAmount=20;

        System.out.println(product);
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
public class Main {
    public static void main(String[] args) {

        //init with constructor parameters
        Product product2 = new Product(2,"PC","Prebuilt PC",15000,10,"black");

        //init empty and fill with setters
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(10000);
        product.setStockAmount(3);
        product.setColor("gray");

        System.out.println(product.getId());
        System.out.println(product.getCode());
        System.out.println(product);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


        System.out.println(product2.getName());
        System.out.println(product2.getCode());
        System.out.println(product2);

        productManager.Add(product2);

    }
}
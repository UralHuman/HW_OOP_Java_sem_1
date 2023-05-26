import java.util.ArrayList;
import java.util.List;


class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayProducts() {
        System.out.println("Available products in the vending machine:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Calories: " + product.getCalories());
            System.out.println("-----------------------");
        }
    }
}


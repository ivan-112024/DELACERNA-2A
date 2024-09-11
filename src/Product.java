import java.util.Scanner;

public class Product {
     
    int id;
    String name;
    String category;
    int stockQuantity;
    double pricePerUnit;

    public Product(int id, String name, String category, int stockQuantity, double pricePerUnit) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.pricePerUnit = pricePerUnit;
    }

    public boolean isValid() {
        return stockQuantity > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Products: ");
        int numProducts = scanner.nextInt();

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details of product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Category: ");
            String category = scanner.next();

            System.out.print("Stock Quantity: ");
            int stockQuantity = scanner.nextInt();

            System.out.print("Price per Unit: ");
            double pricePerUnit = scanner.nextDouble();

            products[i] = new Product(id, name, category, stockQuantity, pricePerUnit);
        }

        System.out.println("ID\tName\tCategory\tStock Quantity\tPrice per Unit\tStatus");
        for (Product product : products) {
            System.out.println(product.id + "\t" + product.name + "\t" + product.category + "\t" + product.stockQuantity + "\t$" + String.format("%.2f", product.pricePerUnit) + "\t" + (product.isValid() ? "Valid" : "Invalid"));
        }
    }
}


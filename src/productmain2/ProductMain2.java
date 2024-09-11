
package productmain2;

import java.util.Scanner;


public class ProductMain2 {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine();  

        Product[] products = new Product[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("\nEnter details of product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Stock Quantity: ");
            int stockQuantity = scanner.nextInt();

            System.out.print("Price per Unit: ");
            double pricePerUnit = scanner.nextDouble();
            scanner.nextLine();  

            products[i] = new Product(id, name, category, stockQuantity, pricePerUnit);
        }

       
        System.out.printf("%-5s %-20s %-15s %-15s %-10s %-10s%n", 
                          "ID", "Name", "Category", "Stock Quantity", "Price", "Status");

        for (Product product : products) {
            product.display();
        }

        scanner.close();
    }
}
    
   
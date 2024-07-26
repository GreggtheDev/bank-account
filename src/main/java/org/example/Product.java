package org.example;

public class Product {
    private double cost;
    private int quantity;
    private String productName;

    // Constructor to initialize product name, cost, and quantity
    public Product(String productName, double cost, int quantity) {
        this.productName = productName;
        this.cost = cost;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    public void totalCost() {
        double totalCost = cost * quantity;
        System.out.println("Total cost for " + quantity + " units of " + productName + " is $" + totalCost);
    }

    // Method to print product details
    public void printProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Cost per unit: $" + cost);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        // Instantiate a Product object
        Product product = new Product("Laptop", 799.99, 2);

        // Call the printProduct and totalCost methods
        product.printProduct();
        product.totalCost();
    }
}

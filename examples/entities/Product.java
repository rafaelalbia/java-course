package entities;

import java.util.Scanner;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    // public int addProduct() {
    // }

    // public int removeProducts() {
    // }

    public void productData() {
        System.out.printf(
            "%nProduct data: %s, $ %.2f, %d units, Total: $ %.2f%n",
            name,
            price,
            quantity,
            totalValueInStock()
        );
    }
}

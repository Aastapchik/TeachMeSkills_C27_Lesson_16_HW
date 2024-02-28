package com.teackmeskills.task.product;

/**
 * The class is a template for Product objects
 */
public class Product {

    String productName;
    String price;

    public Product(String productName, String price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

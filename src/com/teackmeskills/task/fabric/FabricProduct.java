package com.teackmeskills.task.fabric;

import com.teackmeskills.task.product.Product;

/**
 * The class contains a method that creates objects of the Product type
 */
public class FabricProduct {

    public static Product[] fabricProduct(){

        Product[] products = new Product[5];
        products[0] = new Product("Orange", "$2.59");
        products[1] = new Product("Apple", "$1.78");
        products[2] = new Product("Coca-Cola", "$1.29");
        products[3] = new Product("Cheese", "$5.87");
        products[4] = new Product("Milk", "$1.07");
        return products;

    }

}

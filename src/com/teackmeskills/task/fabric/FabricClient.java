package com.teackmeskills.task.fabric;

import com.teackmeskills.task.client.Client;
import com.teackmeskills.task.contstant.Const;
import com.teackmeskills.task.product.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * The class contains a method that creates objects of the Client type
 */
public class FabricClient {

    public static Client[] fabricClient(Product[] products) {

        Map<Integer, Product> productsFistClient = new HashMap<>(2);
        productsFistClient.put(1, products[0]);
        productsFistClient.put(2, products[3]);

        Map<Integer, Product> productsSecondClient = new HashMap<>(4);
        productsSecondClient.put(1, products[1]);
        productsSecondClient.put(2, products[2]);
        productsSecondClient.put(3, products[3]);
        productsSecondClient.put(4, products[4]);

        Map<Integer, Product> productsThirdClient = new HashMap<>(2);
        productsThirdClient.put(1, products[1]);
        productsThirdClient.put(2, products[4]);

        Map<Integer, Product> productsFourthClient = new HashMap<>(3);
        productsFourthClient.put(1, products[0]);
        productsFourthClient.put(2, products[3]);
        productsFourthClient.put(3, products[4]);

        Client[] clients = new Client[4];
        clients[0] = new Client("Nikolay", "26", "12.05.2021", productsFistClient);
        clients[1] = new Client("Alex", "18", "24.07.2020", productsSecondClient);
        clients[2] = new Client("Artyom", "27", "27.02.2020", productsThirdClient);
        clients[3] = new Client("Polina", "34", "16.07.2019", productsFourthClient);
        return clients;
    }
}

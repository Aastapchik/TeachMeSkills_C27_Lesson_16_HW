package com.teackmeskills.task.client;

import com.teackmeskills.task.product.Product;

import java.util.Map;

/**
 * The class is a template for Client objects
 */
public class Client {

    public String name;
    public String age;
    public String dateOfReg;
    public Map<Integer, Product> productMap;

    public Client(String name, String age, String dateOfReg, Map<Integer, Product> productMap) {
        this.name = name;
        this.age = age;
        this.dateOfReg = dateOfReg;
        this.productMap = productMap;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dateOfReg='" + dateOfReg + '\'' +
                ", productMap=" + productMap +
                '}';
    }
}

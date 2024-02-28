package com.teackmeskills.task.service;

import com.teackmeskills.task.client.Client;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * The class contains methods for processing maps in various ways
 */
public class Service {

    public static void serviceForEach(Map<String, Client> clientHashMap) {

        for (Map.Entry<String, Client> entry : clientHashMap.entrySet()) {
            String key = entry.getKey();
            Client value = entry.getValue();
            System.out.println("Ключ = " + key + "; Значение: " + value);
        }
    }

    public static void serviceIterator(Map<String, Client> clientHashMap) {

        Iterator<Map.Entry<String, Client>> iterator = clientHashMap.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry<String, Client> entry = iterator.next();
            String key = entry.getKey();
            Client value = entry.getValue();
            System.out.println("Ключ = " + key + "; Значение: " + value);

        }
    }

    public static void serviceKeySet(Map<String, Client> clientHashMap) {
        Set<String> mapKeySet = clientHashMap.keySet();
        for (String s : mapKeySet) {
            System.out.println("Ключ: " + s);
        }
    }


    public static void serviceClientSet(Map<String, Client> clientHashMap) {
        Set<Map.Entry<String, Client>> mapClientSet = clientHashMap.entrySet();
        for (Map.Entry<String, Client> client : mapClientSet) {
            System.out.println("Клиент: " + client);
        }
    }
}

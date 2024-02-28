package com.teackmeskills.task.runner;

import com.teackmeskills.task.client.Client;
import com.teackmeskills.task.contstant.Const;
import com.teackmeskills.task.fabric.FabricClient;
import com.teackmeskills.task.fabric.FabricProduct;
import com.teackmeskills.task.service.Service;

import java.util.*;

/**
 * A class to simulate the operation of the program
 */
public class Runner {

    public static void main(String[] args) {
        Client[] clients = FabricClient.fabricClient(FabricProduct.fabricProduct());
        try {
            Map<String, Client> clientHashMap = new HashMap<>(4);
            clientHashMap.put(Const.NUMBER_PASSWORD_FIRST_CLIENT, clients[0]);
            clientHashMap.put(Const.NUMBER_PASSWORD_SECOND_CLIENT, clients[1]);
            clientHashMap.put(Const.NUMBER_PASSWORD_THIRD_CLIENT, clients[2]);
            clientHashMap.put(Const.NUMBER_PASSWORD_FOURTH_CLIENT, clients[3]);
            System.out.println("Желаете вывести через For-each? Введите 1.\nЖелаете вывести через Iterator? Введите 2.\nЖелаете вывести только ключи? Введите 3.\nЖелаете вывести только значения? Введите 4.\nВыйти из программы? Введите 0.");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            switch (k) {
                case 1: {
                    Service.serviceForEach(clientHashMap);
                    break;
                }
                case 2: {
                    Service.serviceIterator(clientHashMap);
                    break;
                }
                case 3: {
                    Service.serviceKeySet(clientHashMap);
                    break;
                }
                case 4: {
                    Service.serviceClientSet(clientHashMap);
                    break;
                }
                default: {
                    System.out.println("Выход из программы.");
                }
            }
        } catch (Exception e) {
            System.out.println("Неверное значение");
        }
    }
}


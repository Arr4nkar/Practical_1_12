/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz_1_12;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author gnekh
 */
public class Dz_1_12 {
    public static void main(String[] args) {
        System.out.println("Нехаев Глеб Сергеевич, вариант 2, группа РИБО-01-22");

        String filePath = getPathFromUser();
        MessageDeserializer messageDeserializer = new MessageDeserializer(filePath);

        try {
            Message message = messageDeserializer.deserializeMessage();
            System.out.println("Содержимое Message:");
            System.out.println(message);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации объекта: " + e.getMessage());
        }
    }

    private static String getPathFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Путь к файлу для десериализации: ");
        return scanner.nextLine();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_1_12;

import java.io.*;
/**
 *
 * @author gnekh
 */
class MessageDeserializer {
    private String filePath;

    public MessageDeserializer(String filePath) {
        this.filePath = filePath;
    }

    public Message deserializeMessage() throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Message) objectInputStream.readObject();
        }
    }
}

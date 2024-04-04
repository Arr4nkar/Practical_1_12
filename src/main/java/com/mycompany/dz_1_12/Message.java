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
class Message implements Serializable {
    private static final long serialVersionUID = -3380157693869190848L;
    private int id;
    private String body;
    private String type;
    private boolean hasAttachments;
    private long timestamp;

    public Message(int id, String body, String type, boolean hasAttachments, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachments = hasAttachments;
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", type='" + type + '\'' +
                ", hasAttachments=" + hasAttachments +
                ", timestamp=" + timestamp +
                '}';
    }    
    }

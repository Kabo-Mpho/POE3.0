/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe3;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_Lab
 */
public class array_methods {
    
     String[] Sent_Messages;
    String[] Disregarded_Messages;
    String[] Stored_Message;
    String[] Message_Hash;
    String[] Message_ID;
    int count = 0;
    
    
    //constructor
    public array_methods(int messageCount){
        this.Sent_Messages = new String[messageCount];
        this.Disregarded_Messages = new String[messageCount];
        this.Stored_Message = new String[messageCount];
        this.Message_Hash = new String[messageCount];
        this.Message_ID = new String[messageCount];
        this.count = messageCount;
    }

    array_methods() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //
    public void initialiseArrays(){
        for(int i = 0; i < count; i++){
             this.Sent_Messages [i] = "";
             this.Disregarded_Messages [i] = "";
             this.Stored_Message[i] = "";
             this.Message_Hash  [i] = "";
             this.Message_ID  [i] = "";
        }
    }
    
    public void sendMessage(String sentMessage, int message_Number){
        this.Sent_Messages[message_Number - 1] = sentMessage; 
        //behind the scences
        this.Stored_Message[message_Number - 1] = sentMessage;
    }
    public void savedHashMessage(String message_Hash, int message_Number){
        this.Message_Hash[message_Number - 1] = message_Hash;
    }
    public void savedMessageID(String message_ID, int message_Number){
        this.Message_ID[message_Number - 1] = message_ID;
    }
    //getters
    public String[] getSentMessage(){
        return this.Sent_Messages;
    }
    public String[] getStoreMessage(){
        return this.Stored_Message;
    }
    public String[] getMessageHash(){
        return this.Message_Hash;
    }
    public String[] getMessageID(){
        return this.Message_ID;
    }
    public String getMessageInfoAtIndex(int index){
        return "Sent Message: " + this.Sent_Messages[index] +'\n' + "Message Hash: " + this.Message_Hash[index] + '\n' + "Message ID" + this.Message_ID[index];
    }
    //Display the Longest message
    public String getLongestMessage(){
        //set max
        int max = this.Sent_Messages[0].length();
        int position = 0;
        //loop through array
        for(int i = 0; i < this.count; i++){
        if(this.Sent_Messages[i].length() > max){
            //set new max
            max = this.Sent_Messages[i].length();
            //update index
            position = i;
        }
    }
        System.out.println("Longest Message: " + this.Sent_Messages[position]);
        return null;
    }
    public String getMessageUsingID(String ID){
        //store index position
        int index = 0;
        //loop through the messageID array
        for (int i = 0; i < this.count; i++){
            if(this.Message_ID[i].equals(ID)){
                index = i; 
                return this.Sent_Messages[index];
            }
        }
        return "not found";
    }
    public void DisplayReport(){
        String message = "";
        for(int c = 0; c < this.count; c++){
            message += ("Sent Message: " + this.Sent_Messages[c]) + "\n Message Hash: " + this.Message_Hash[c] + "\n message ID: " + this.Message_ID[c] + '\n';
        }
    
        JOptionPane.showMessageDialog(null, message);
    }  
    public void DisregardMessageUsingHash(String Hash){
        boolean disregarded = false;
        //loop through the message Array 
        for(int i = 0; i< this.count; i++){
            if(this.Message_Hash[i].equals(Hash)){
                //Store the sent message using the hash to find it 
                this.Disregarded_Messages[i] =
                        this.Sent_Messages[i];
                //remove the message from sent message 
                this.Sent_Messages[i] = "";
                this.Message_ID[i] = "";
                this.Message_Hash[i] = "";
                disregarded = true;
                JOptionPane.showMessageDialog(null, "Message successfully disregarded");
                this.DisplayReport();
                break;
            }
        }
        if(disregarded == false){
            JOptionPane.showMessageDialog(null, "Message not successfully disregarded");
        }
    }
    public void DisplayDisregardedMessage(){
        String message = "";
        for(int c = 0; c < this.count; c++){
            if(!this.Disregarded_Messages[c].equals("")){
                message += "Disregarded message: " + this.Disregarded_Messages[c];
            }
            JOptionPane.showMessageDialog(null, message);
        }
    }
}


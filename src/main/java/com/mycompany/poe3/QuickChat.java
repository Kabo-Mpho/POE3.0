/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_Lab
 */
public class QuickChat {
    private int totalMessageSent = 0;
    
    public void startChat(int totalMessagesSent){
    JOptionPane.showMessageDialog(null, "Welcome to QuickChat");
    
    String input = JOptionPane.showInputDialog("Please enter the amount of messages that you would like to send.");
    if (input == null)return;
    
    int messageLimit;
    try{
        messageLimit = Integer.parseInt(input);
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        return;
    }
    //reset counter when starting a new chat session
    totalMessagesSent = 0;
    
    int choice = 0;
    while (choice !=3){
        String menu = "___QuickChat menu___\n"
                + "1. Send a message\n"
                + "2. Show recently sent messages\n"
                + "3. Exit\n"
                +  "Please choose an option";
        
        String userChoice = JOptionPane.showInputDialog(menu);
        if(userChoice == null) break;
        try{
            choice = Integer.parseInt(userChoice);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Your input is invalid. Please enter a number from 1 - 3");
            continue;
        }
        switch (choice){
            case 1:
                //call the methods
                sendMessages(messageLimit, totalMessageSent);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Coming soon...");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Exiting the QuickChat App. Bye bye!");
                return;
                
            default:
                JOptionPane.showMessageDialog(null, "Invalid entry, please try again.");
        }
    }
}
    private void sendMessages(int messageLimit, int totalMessagesSent){
       
        for (int i = 0; i < messageLimit; i++){
            long messageID = generateMessageID();
            totalMessageSent++;
            

            String recipient = JOptionPane.showInputDialog("Please enter the recipients phone number *+27........*: ");
            if(recipient == null)return;
            if(!recipient.startsWith("+27") || recipient.length() != 12){
                JOptionPane.showMessageDialog(null, "The recipient number that you entered is invalid. Please make sure it includes *+27.........*");
                return;
                
            }
            
            String message = JOptionPane.showInputDialog("Enter message (a maximum of 250 characters): ");
            if (message == null) return;
            if(message.length() > 250) {
                JOptionPane.showMessageDialog(null, "Please enter less than 250 characters.");
                return;
               
            }
            
            //send message
            totalMessageSent++;
            JOptionPane.showMessageDialog(null, "Message has been sent to " + recipient);
            
            
            String action = JOptionPane.showInputDialog("Please select an option\n" 
            + "1. send a message\n"
            + "2. Ignore the message\n"
            + "3. Store the message to send it later");
            
            
            if (action == null)return;
            int act;
            try{
                act = Integer.parseInt(action);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Your input is invalid, please try again");
               return;
            }
            if (act == 2){
                JOptionPane.showMessageDialog(null, "Your message has been disregarded.");
               return;
            }
            String messageHash = generateMessageHash(messageID, totalMessagesSent, message);
            String info = "___Message Details___\n" 
                    + "Message ID: %d\n"
                    + "Message Count: %d\n"
                    + "Recipient: %s\n"
                    + "Message: %s\n"
                    + "Message Hash: %s\n";
           
           
            
            if (act == 3){
                storeMessageInJson(messageID, totalMessagesSent, recipient, message, messageHash, "stored");
                
                JOptionPane.showMessageDialog(null, "The message has been stored for later use.\n" + info);
            }else{
                storeMessageInJson(messageID, totalMessagesSent, recipient, message, messageHash, "Sent");
                
                JOptionPane.showMessageDialog(null, "Your message was successfully sent!\n" + info);
            }
        }
        JOptionPane.showMessageDialog(null, "The total messages processed: " + totalMessagesSent);
    }
    private long generateMessageID(){
        Random rand = new Random();
        return 1000000000L + rand.nextInt(900000000);
    }
    private String generateMessageHash(long messageID, int msgCount, String message){
        String[] words = message.split(" ");
        String firstWord = words.length > 0 ? words[0] : "";
        String lastWord = words.length > 1 ? words[words.length - 1] : firstWord;
        String prefix = String.valueOf(messageID).substring(0,2);
        return(prefix + ":" + msgCount + ":" + firstWord + ":" + lastWord).toUpperCase();
    }
    private void storeMessageInJson (long id, int count,String recipient, String message, String hash, String status){
        String json;
        json = String.format("\n \"MessageID\": %d,\n \"Count\": %d,\n \"Recipient\": \"%s\",\n \"Message\": \"%s\",\n \"Hash\": \"%s\",\n \"Status\": \"%s\"\n}\n", id, count, recipient, message, hash, status);
        
        try(FileWriter writer = new FileWriter("messages.json", true)){
            writer.write(json);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "There was an error saving your message: " + e.getMessage());
        }
    }

    private void sendMessages(int messageLimit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

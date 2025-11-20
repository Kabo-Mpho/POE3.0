/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe3;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_Lab
 */
public class POE3 {
    private static Login loginObj = new Login();
private static QuickChat chatObj = new QuickChat();


    public static void main(String[] args) {
        displayMenu();
    }
    
    private static void displayMenu(){
        int choice = 0;
        
              
        
        while (choice != 3){
        String menu = "____wecome to the App___\n"
                + "1. register\n"
                + "2. Login\n"
                + "3. Exit\n"
                + " Hi hi. Please select an opotion\n";
        
           
           String input = JOptionPane.showInputDialog(null,menu,"App Menu", JOptionPane.QUESTION_MESSAGE);
           //to close/exit
           if (input == null) break;
           try{
               choice = Integer.parseInt(input);
           }catch
                   (NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Please enter a valid number (1-3).");
               continue;
           }
           switch (choice){ 
               case 1 -> register();
               case 2 -> login();
               case 3 -> 
               JOptionPane.showMessageDialog(null, "Thank you, bye!");
               default -> 
                   JOptionPane.showMessageDialog(null, "Please enter a valid option");
           }
    }
    }
    private static void register(){
        String firstname = JOptionPane.showInputDialog("Please enter your first name: ");
        if (firstname == null)return;
        String lastname = JOptionPane.showInputDialog("Please enter your last name: ");
        if (lastname == null)return;
        String username = JOptionPane.showInputDialog("Please enter your username *it must have a maximumof 5 characters, have an underscore '_': ");
        if (username == null)return;
        String password = JOptionPane.showInputDialog("Please enter your password *it msut have a minumum of 8 characters, it must have a Capital letter(s), number(s), Special character(s): ");
        if(password == null)return;
        String cellphone = JOptionPane.showInputDialog("Please enter youir cellphone number *+27.........*: ");
        if(cellphone == null)return;
        String output = loginObj.registerUser(firstname, lastname, username, password, cellphone);
        JOptionPane.showMessageDialog(null, output);
    }
    private static void login(){
        String enteredUsername = JOptionPane.showInputDialog("Please enter your username: ");
        if (enteredUsername == null)return;
        String enteredPassword = JOptionPane.showInputDialog("Please enter your password: ");
        if (enteredPassword == null)return;
        
        boolean isLogin = loginObj.login(enteredUsername, enteredPassword);
        if(isLogin){
            
            JOptionPane.showMessageDialog(null, "Hi hi" + loginObj.getFirstname() + "" + loginObj.getLastname() + " Welcome to the QuickChat app!");
            QuickChat chatObj = new QuickChat();
            
        }else{
            JOptionPane.showMessageDialog(null, "Your username or Password is incorrect, please check your credentials and try again sweets");
        }
           int numberOfMessages = 0;
        boolean EXIT = false; 
        //greet the user 
        JOptionPane.showMessageDialog(null, WelcomeMessage());
        //request number of messages to send 
        numberOfMessages = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Messages To Send"));
        QuickChat obj = new QuickChat();
        while(EXIT != true){
            //local variable int
            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            switch (choice){
                case 1: 
                    numberOfMessages++;
                    JOptionPane.showMessageDialog(null, "Hello World!", "+2782678167", numberOfMessages);
                    break;
                case 2:
                    break;
                case 3: 
                    EXIT = true;
                    break;
                default:
            }//end of switch
        }//end of while 
         int number = Integer.parseInt(JOptionPane.showInputDialog("Enter number of messages the user must enter: "));
        //use number to instantiate the message Object
        array_methods messageObject = new array_methods(number);
        //Input messages into the message Object
        for (int counter = 0; counter < number; counter++){
            int loopcount = counter +1;
            String message = JOptionPane.showInputDialog("Please enter message number: " + loopcount);
            messageObject.sendMessage(message, loopcount);
            messageObject.savedHashMessage("#" + message + "#", loopcount);
            messageObject.savedMessageID(counter + "ID", loopcount);
            //display message of the messageObject
            for(int i = 0; i < number; i++){
                JOptionPane.showMessageDialog(null, messageObject.getMessageInfoAtIndex(i));
            }
            //call getLongest message
            
        }
    }//end of main
    public static String menu(){
        return "Option 1) Send Messages\n"
                + "Option 2) Show recently sent messages\n"
                + "Optin 3) Quit";
    }
    public static String WelcomeMessage(){
        return "Welcome to Quick chat!";
    }//end of WelcomeMessage
        
    }

    


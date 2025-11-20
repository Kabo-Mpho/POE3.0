/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe3;

/**
 *
 * @author RC_Student_Lab
 */
public class Login {
     private String firstname;
     private String lastname;
      private String username;
       private String password;
        private String cellphone;
        
        public String getFirstname(){
            return firstname;
        }
        public String getLastname(){
            return lastname;
        }
        
        public boolean checkUsername(String username){
            return username.contains("_") && username.length()<= 5;
        }//checking the format for the username
        
        public boolean checkPasswordComplexity(String password){
            boolean hasUppercase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;
            if (password.length() <8)return false;
            
            for (char c : password.toCharArray()){
                if (Character.isUpperCase(c)) hasUppercase = true;
                else if (Character.isDigit(c)) hasDigit = true;
                else if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
            }
            return hasUppercase && hasDigit && hasSpecialChar;
        }// method to check password complexity
                
        public boolean checkCellphone(String cellphone){
            return cellphone.matches("\\+27\\d{9}");
        }//Method to check is cellphone number is valid 
        
        public String registerUser(String firstname, String lastname, String username, String password, String cellphone){
            if(!checkUsername(username)){
                return "Your username is not in the correcty format.\n" + "Please make sure that is has an underscore(_) and it should NOT be more than 5 characters long.";
            }
            if (!checkPasswordComplexity(password)){
                return "Please check your password, it is not correctly formatted.\n" + "Make sure that it has at least 8 characters, a capital letter(s), a number(s) and a special charfacter(s).";
            }
            if (!checkCellphone(cellphone)){
                return "Your cellphone number is invalid.\n" + "Please make sure that it starts with +27 with 9 didgits after it.";
            }//Registering the user
            
            this.firstname = firstname;
            this.lastname = lastname;
            this.username = username;
            this.password = password;
            this.cellphone = cellphone;
            return "Congradulations your login was successful\n Welcome " + firstname + " " + lastname + " .";
            
        }
        public boolean login(String enteredUsername, String enteredPassword){
            return enteredUsername.equals(username)&&enteredPassword.equals(password);
        }//login method
        
}

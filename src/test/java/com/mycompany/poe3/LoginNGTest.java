/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.poe3;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author RC_Student_Lab
 */
public class LoginNGTest {
    
    public LoginNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testCheckCellphone() {
        System.out.println("checkCellphone");
        String cellphone = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellphone(cellphone);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String firstname = "";
        String lastname = "";
        String username = "";
        String password = "";
        String cellphone = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(firstname, lastname, username, password, cellphone);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testLogin() {
        System.out.println("login");
        String enteredUsername = "";
        String enteredPassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.login(enteredUsername, enteredPassword);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}

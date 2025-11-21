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
public class POE3NGTest {
    
    public POE3NGTest() {
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
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        POE3.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testMenu() {
        System.out.println("menu");
        String expResult = "";
        String result = POE3.menu();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testWelcomeMessage() {
        System.out.println("WelcomeMessage");
        String expResult = "";
        String result = POE3.WelcomeMessage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

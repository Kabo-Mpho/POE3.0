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
public class array_methodsNGTest {
    
    public array_methodsNGTest() {
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
    public void testInitialiseArrays() {
        System.out.println("initialiseArrays");
        array_methods instance = new array_methods();
        instance.initialiseArrays();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        String sentMessage = "";
        int message_Number = 0;
        array_methods instance = new array_methods();
        instance.sendMessage(sentMessage, message_Number);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSavedHashMessage() {
        System.out.println("savedHashMessage");
        String message_Hash = "";
        int message_Number = 0;
        array_methods instance = new array_methods();
        instance.savedHashMessage(message_Hash, message_Number);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSavedMessageID() {
        System.out.println("savedMessageID");
        String message_ID = "";
        int message_Number = 0;
        array_methods instance = new array_methods();
        instance.savedMessageID(message_ID, message_Number);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetSentMessage() {
        System.out.println("getSentMessage");
        array_methods instance = new array_methods();
        String[] expResult = null;
        String[] result = instance.getSentMessage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetStoreMessage() {
        System.out.println("getStoreMessage");
        array_methods instance = new array_methods();
        String[] expResult = null;
        String[] result = instance.getStoreMessage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        array_methods instance = new array_methods();
        String[] expResult = null;
        String[] result = instance.getMessageHash();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        array_methods instance = new array_methods();
        String[] expResult = null;
        String[] result = instance.getMessageID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testGetMessageInfoAtIndex() {
        System.out.println("getMessageInfoAtIndex");
        int index = 0;
        array_methods instance = new array_methods();
        String expResult = "";
        String result = instance.getMessageInfoAtIndex(index);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetLongestMessage() {
        System.out.println("getLongestMessage");
        array_methods instance = new array_methods();
        String expResult = "";
        String result = instance.getLongestMessage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testGetMessageUsingID() {
        System.out.println("getMessageUsingID");
        String ID = "";
        array_methods instance = new array_methods();
        String expResult = "";
        String result = instance.getMessageUsingID(ID);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testDisplayReport() {
        System.out.println("DisplayReport");
        array_methods instance = new array_methods();
        instance.DisplayReport();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testDisregardMessageUsingHash() {
        System.out.println("DisregardMessageUsingHash");
        String Hash = "";
        array_methods instance = new array_methods();
        instance.DisregardMessageUsingHash(Hash);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testDisplayDisregardedMessage() {
        System.out.println("DisplayDisregardedMessage");
        array_methods instance = new array_methods();
        instance.DisplayDisregardedMessage();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

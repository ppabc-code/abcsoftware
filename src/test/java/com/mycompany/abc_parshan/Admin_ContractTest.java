/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abc_parshan;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author parshanmohebbian
 */
public class Admin_ContractTest {
    
    public Admin_ContractTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of userList method, of class Admin_Contract.
     */
    @Test
    public void testUserList() {
        System.out.println("userList");
        Admin_Contract instance = new Admin_Contract();
        ArrayList<Admin_data> expResult = null;
        ArrayList<Admin_data> result = instance.userList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show_user method, of class Admin_Contract.
     */
    @Test
    public void testShow_user() {
        System.out.println("show_user");
        Admin_Contract instance = new Admin_Contract();
        instance.show_user();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Admin_Contract.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Admin_Contract.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

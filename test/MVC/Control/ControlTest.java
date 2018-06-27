/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Control;

import MVC.Model.Game;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Todd
 */
public class ControlTest {
    
    public ControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compareWeakness method, of class Control.
     */
    @Test
    public void testCompareWeakness() {
        System.out.println("compareWeakness");
        Control.compareWeakness();
        
        
    }

    /**
     * Test of createGameObject method, of class Control.
     */
    @Test
    public void testCreateGameObject() {
        System.out.println("createGameObject");
        int choice = 2;
        Control.createGameObject(choice);
       
    }

    /**
     * Test of getGame method, of class Control.
     */
    @Test
    public void testGetGame() {
    }

    /**
     * Test of setGame method, of class Control.
     */
    @Test
    public void testSetGame() {
    }

    /**
     * Test of getGame method, of class Control.
     */
   
}

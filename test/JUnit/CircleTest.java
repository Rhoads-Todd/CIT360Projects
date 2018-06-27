/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Todd
 */
public class CircleTest {
    
    public CircleTest() {
    }

    /**
     * Test of findCircumference method, of class Circle.
     */
    @Test
    public void testFindCircumference() {
        // Case 1
        double actual_1 = Circle.findCircumference(2);
        
        double expected_1 = 12.56637061435;
        assertEquals(expected_1, actual_1, 0.000001);
        
         
        // Case 2
        double actual_2 = Circle.findCircumference(4);
        
        double expected_2 = 25.132741228718;
        assertEquals(expected_2, actual_2, 0.000001);
    }

    /**
     * Test of findArea method, of class Circle.
     */
    @Test
    public void testFindArea() {
        // Case 1 
        double actual1 = Circle.findArea(2);
        
        double expected1 = 12.56637061435;
        assertEquals(expected1, actual1, 0.000001);
        
    
      //Case 2 
        
        double actual_2 = Circle.findArea(4);
        
        double expected_2 = 50.265482457;
        assertEquals(expected_2, actual_2, 0.000001);
    
    
    }
    
}

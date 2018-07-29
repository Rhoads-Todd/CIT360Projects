/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisatest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static thisisatest.ThisIsATest.objectCheck;


/**
 *
 * @author Todd
 */
public class ThisIsATestTest {
    
    public ThisIsATestTest() {
    }

   
 

    
    
    /**
     * Test of findCircumference method, of class Circle.
     */
    @Test
    public void testFindCircumference() {
        // Case 1
        double actual_1 = ThisIsATest.findCircumference(2);
        
        double expected_1 = 12.56637061435;
        assertEquals(expected_1, actual_1, 0.000001);
        
         
        // Case 2
        double actual_2 = ThisIsATest.findCircumference(4);
        
        double expected_2 = 25.132741228718;
        assertEquals(expected_2, actual_2, 0.000001);
    }

    /**
     * Test of findArea method, of class Circle.
     */
    @Test
    public void testFindArea() {
        // Case 1 
        double actual1 = ThisIsATest.findArea(2);
        
        double expected1 = 12.56637061435;
        assertEquals(expected1, actual1, 0.000001);
        
    
      //Case 2 
        
        double actual_2 = ThisIsATest.findArea(4);
        
        double expected_2 = 50.265482457;
        assertEquals(expected_2, actual_2, 0.000001);
    
    
    }
    @Test
    public void testArrayTest(){
       
        int [] arrayTest = ThisIsATest.arrayTest();
        int [] expected = {1,2,3,4,5,6};
        Assert.assertArrayEquals(arrayTest, expected);
    }
@Test
   public void testTestString(){
   String test = ThisIsATest.testString();
   String expected =  "This is a test!";
   Assert.assertEquals(test, expected);
    }
@Test
   public  void testObjectCheck(){ 
      Person [] team = objectCheck();
      Person [] teamTest = team;
      
       Assert.assertArrayEquals(team, teamTest);
    }
   }
  
    


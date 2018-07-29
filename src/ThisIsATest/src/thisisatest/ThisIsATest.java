/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisatest;

import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class ThisIsATest {
    
   
 
public  static Person[]  objectCheck(){
 Person [] team = new Person [5]; 
 
 Person jordan = new Person();
 jordan.setLastName("Jordan");
 team[Bulls.Jordan.ordinal()] =  jordan;
 
 Person rodman = new Person();
 rodman.setLastName("Rodman");
 team[Bulls.Rodman.ordinal()] =  rodman;
 
 Person longley = new Person();
 longley.setLastName("Longley");
 team[Bulls.Longley.ordinal()] =  longley;
 
 Person harper = new Person();
 harper.setLastName("Harper");
 team[Bulls.Harper.ordinal()] =  harper;
 
 Person pippen = new Person();
 pippen.setLastName("Pippen");
 team[Bulls.Pippen.ordinal()] =  pippen;
 
 return team;
}

    
    public static double findArea(double radius){
       double area = Math.PI * radius * radius;
        
        return area;
    
    
    
    }
    
    public static double findCircumference (double radius){
    
        double circumference = 2 * Math.PI * radius;
        
    return circumference;
    }

   public static int[] arrayTest(){
    int [] nums = new int [6];
    
    for (int i =0; i < nums.length; i++){
        nums[i] = i + 1;
        
        System.out.println (nums[i]);
    }
      return nums;
   
   
   }
public static String testString(){
  String test = "This is a test!";
   return test;
}

public enum Bulls{
 Jordan,
 Pippen,
 Rodman,
 Harper,
 Longley
}


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

/**
 *
 * @author Todd
 */
public class Circle {
    
    public static double findArea(double radius){
       double area = Math.PI * radius * radius;
        
        return area;
    
    
    
    }
    
    public static double findCircumference (double radius){
    
        double circumference = 2 * Math.PI * radius;
        
    return circumference;
    }
}

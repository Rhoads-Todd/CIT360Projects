/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUNIT_Test;

/**
 *
 * @author Todd
 */
public class SimpleMath {
    
    public double calculateIncome(float wage, float hours){
        double pay;
         
        double gross = wage * hours;
              
        if  (hours > 40)
        {
        
            double overtimeHours   = hours - 40;
            gross = 40 * wage;
            double overtime = overtimeHours * wage * 1.5;
            
            gross = overtime + gross;
        }
        
        
        double tax = gross * .13;
         
         pay = gross - tax;
        return pay;
    }
}

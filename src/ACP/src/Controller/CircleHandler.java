/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.HashMap;



/**
 *
 * @author Todd
 */
public class CircleHandler implements Handler {

    @Override
    public void execute(HashMap<String, Object> data) {
        
      double area = (double)data.get("length") * Math.PI *(double)data.get("length");
      
      System.out.println("The area of the circle is " + area);
    }

    
    
}

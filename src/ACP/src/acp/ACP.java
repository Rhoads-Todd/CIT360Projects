/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acp;

import Controller.CircleHandler;
import Controller.AppController;
import Controller.Handler;
import Controller.SquareHandler;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class ACP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
        AppController appController = new AppController();
        
        SquareHandler squareHandler = new SquareHandler();
        CircleHandler circleHandler = new CircleHandler();
        
        HashMap<String, Object> data = new HashMap(); 
        
        
        appController.mapCommand("Square", squareHandler);
        appController.mapCommand("Circle", circleHandler);
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        
        data.put("length", input);
       
        
        appController.handleRequest("Square", data);
        appController.handleRequest("Circle", data);
    }
    
}

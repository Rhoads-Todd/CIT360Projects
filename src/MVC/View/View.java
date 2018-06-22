/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.View;

import MVC.Control.Control;
import MVC.Model.GameObject;
import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class View {
   
    public void display(){

    int choice;
        boolean valid = false;
    
   
    
while(!valid)    {System.out.println("Welcome to the game. Choose your weapon: ");
    System.out.println("1. Rock\n"
    + "2. Paper\n"
    + "3. Scissors\n");
    
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    
    if (input.equals("1") || input.equals("2") || input.equals("3") ){
    
    
    valid= true;
    
        choice = Integer.parseInt(input);
              
        Control.createGameObject(choice);
        Control.compareWeakness();
        
    }
    
    else{ 
     System.out.println("Please enter a number between 1 - 3");
     }
}}
}


  
   







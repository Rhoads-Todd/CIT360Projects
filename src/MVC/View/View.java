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
    
   
    
    System.out.println("Welcome to the game. Choose your weapon: ");
    System.out.println("1. Rock\n"
    + "2. Paper\n"
    + "3. Scissors\n");
    
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    choice = Integer.parseInt(input);
    if (choice == 1 || choice == 2 || choice == 3){
    
        choice = Integer.parseInt(input);
              
        Control.createGameObject(choice);
        Control.compareWeakness();
        
    }
    else {

    System.out.println("Please enter a number between 1 - 3");


}
    }

}

    
   







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberGuess;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class NumberGuess {
    
    public static void main(String[] args) {
        
        boolean done = false;
        
        Scanner scanner = new Scanner(System.in);
    
        Random random = new Random();
    
        int randomNumber = random.nextInt(100);

        while (!done) 
             {
                System.out.println("Enter a random number between 1 - 100");
    
               String input = scanner.nextLine();
      
    
              int myInt = Integer.parseInt(input);	
          
              if (myInt < randomNumber){
                    System.out.println("The number is HIGHER \n");
                                        }
       
       else if (myInt == randomNumber){
               
               System.out.println("Congratulations! You guessed correctly! \n");
               done = true;
       
       }
       else {
            System.out.println("The number is LOWER. \n");
       }
      }
    }
    
}

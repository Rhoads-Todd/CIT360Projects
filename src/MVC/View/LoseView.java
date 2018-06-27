/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.View;

import MVC.Control.Control;

/**
 *
 * @author Todd
 */
public class LoseView {
    
    public void display(){
    
  System.out.println("You chose " +MVC.Control.Control.getGame().getPlayerObject().getName() 
          +
          " The computer chose " + MVC.Control.Control.getGame().getComputerObject().getName() + " You lose!\n");
    
    }
}

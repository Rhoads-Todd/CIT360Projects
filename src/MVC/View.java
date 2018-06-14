/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import MVC.Control.GameControl;

/**
 *
 * @author Todd
 */
public class View {
    
    public static void main(String[] args) 
     {
         GameControl gameControl = new GameControl();
         gameControl.createNewGame();
        
     }
}

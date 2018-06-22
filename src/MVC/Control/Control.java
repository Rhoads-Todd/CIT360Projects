/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Control;

import MVC.Model.Game;
import MVC.Model.GameObject;
import MVC.View.DrawView;
import MVC.View.LoseView;
import MVC.View.WinView;
import java.util.Random;

/**
 *
 * @author Todd
 */
public class Control {
    static Game game = null;
    
    public static void compareWeakness (){
        GameObject playerObject = game.getPlayerObject();
        
        Random random = new Random();
        int rand = random.nextInt(4);
        GameObject computerObject = new GameObject();
        
        if (rand ==1){
        computerObject.setName("Rock");
        
        game.setComputerObject(computerObject);
        }
        
        else if(rand == 2){
        computerObject.setName("Paper");
          game.setComputerObject(computerObject);
        }
        
        else
        {
        
        computerObject.setName("Scissors");
        game.setComputerObject(computerObject);
        }
         
        if (playerObject.getName() =="Rock" && computerObject.getName() == "Paper" ||playerObject.getName() == "Scissors" && computerObject.getName() == "Rock" 
                || playerObject.getName() == "Paper" && computerObject.getName() == "Scissors") {
        
        
                        LoseView lose = new LoseView();
                        lose.display();
          
        }
        
        
        
        else if (playerObject.getName() == "Rock" && computerObject.getName() == "Scissors" ||playerObject.getName() == "Scissors" && computerObject.getName() == "Paper" 
                || playerObject.getName() == "Paper" && computerObject.getName() == "Rock"){
        
        WinView win = new WinView();
           win.display();
        
        }
        
        else{
        
        DrawView draw = new DrawView();
        
        draw.display();
        }
        
       


}
    public static void createGameObject(int choice){
        GameObject object = new GameObject();
        Game game = new Game();
       switch(choice){
       
           case 1: 
              object.setName("Rock");
               break;
        case 2: 
               object.setName("Paper");
               break;
       
       case 3: 
               object.setName("Scissors");
               break;
       
       } 
    
   game.setPlayerObject(object);
   setGame(game);
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        Control.game = game;
    }



}

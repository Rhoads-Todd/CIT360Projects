/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Control;

import MVC.Model.Enemy;
import MVC.Model.Game;
import MVC.Model.Player;
/**
 *
 * @author Todd
 */
public class GameControl {
   static Game currentGame;

    public Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }
    
    public  void createNewGame(){
     Player player = new Player();
      Game game = new Game();
      Enemy [] enemies = createEnemies();
      game.setEnemies(enemies);
      
      game.setPlayer(player);
      setCurrentGame(game);
    
    }
   
    public Enemy [] createEnemies()
   {
       Enemy [] enemies = new Enemy [Enemy.EnemyList.values().length];
       
       Enemy ninja = new Enemy();
       
       ninja.setHealth(25);
       ninja.setPower(52);
       ninja.setType("Ninja");
       enemies[Enemy.EnemyList.Ninja.ordinal()] = ninja;
   
    Enemy pirate = new Enemy();
       
       ninja.setHealth(10);
       ninja.setPower(25);
       ninja.setType("Pirate");
       enemies[Enemy.EnemyList.Pirate.ordinal()] = pirate;
   
    Enemy knight = new Enemy();
       
       ninja.setHealth(80);
       ninja.setPower(45);
       ninja.setType("Knight");
       enemies[Enemy.EnemyList.Knight.ordinal()] = knight;
   
    Enemy alien = new Enemy();
       
       ninja.setHealth(10);
       ninja.setPower(100);
       ninja.setType("Alien");
       enemies[Enemy.EnemyList.Alien.ordinal()] = alien;
   
   
   return enemies;
   }
    private void setPlayerName(String  playerName){
   
        Game currentGame = getCurrentGame();
        Player player = currentGame.getPlayer();
        player.setName(playerName);
        currentGame.setPlayer(player);
    }
}

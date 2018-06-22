/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Model;

/**
 *
 * @author Todd
 */
public class Game {
    GameObject playerObject;
    GameObject computerObject;

    public Game() {
    }
    
    

    public GameObject getPlayerObject() {
        return playerObject;
    }

    public void setPlayerObject(GameObject playerObject) {
        this.playerObject = playerObject;
    }

    public GameObject getComputerObject() {
        return computerObject;
    }

    public void setComputerObject(GameObject computerObject) {
        this.computerObject = computerObject;
    }
    
    
}

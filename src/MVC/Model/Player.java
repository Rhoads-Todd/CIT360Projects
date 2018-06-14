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
public class Player {
    String name;
    int health;
    Class playerClass;
    String gender;
    InventoryItem[] items;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Class getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(Class playerClass) {
        this.playerClass = playerClass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public InventoryItem[] getItems() {
        return items;
    }

    public void setItems(InventoryItem[] items) {
        this.items = items;
    }
    
    
}

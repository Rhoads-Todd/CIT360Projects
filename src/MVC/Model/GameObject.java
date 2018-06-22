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
public class GameObject {
    String name;
    String weakness;

    public GameObject(String name, String weakness) {
        this.name = name;
       
    }

    public GameObject() {
       
    }

    
    
    public String getWeakness() {
        return weakness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

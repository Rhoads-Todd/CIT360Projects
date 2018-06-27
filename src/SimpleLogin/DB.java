/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleLogin;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Todd
 */



public class DB {
    LinkedList<User> users;
    HashMap<User, String> usernameDB;
    
    
    public LinkedList<User> getUsers() {
        return users;
    }

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }

    void setUserPasswords(HashMap<User, String> usernameDB) {
        
    }

    public HashMap<User, String> getUsernameDB() {
        return usernameDB;
    }

    public void setUsernameDB(HashMap<User, String> usernameDB) {
        this.usernameDB = usernameDB;
    }
    
    
    
    
}

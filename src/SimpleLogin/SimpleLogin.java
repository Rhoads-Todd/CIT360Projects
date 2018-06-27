/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleLogin;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class SimpleLogin {
    public static void main(String[] args){
        LinkedList <User> list = new LinkedList();
        DB db = new DB();
        HashMap <User, String> usernameDB = new HashMap <User, String>();
        User lu = new User();
    User todd = new User();
    lu.setUserName("Lu");
    lu.setPw("1234");
    todd.setUserName("trhoads");
    
    todd.setPw("1234");
    list.add(todd);
    list.add(lu);
    usernameDB.put(lu, lu.getPw());
    usernameDB.put(todd, todd.getPw());
    
      db.setUsernameDB(usernameDB);
       
  boolean valid = false;  
    db.setUsers(list);
    System.out.println("Username:");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    System.out.println("Password:");
    String password = scanner.nextLine();
    HashMap dbhm =db.getUsernameDB();
   
        for (int i =0; i <  list.size(); i++) {
            if (username.equals(list.get(i).getUserName())  && password.equals(dbhm.get(list.get(i)))) {
                
               
                System.out.println("\nWelcome " + list.get(i).getUserName()+ "!");
                valid = true;
            }  
           
            
        }
        
        if (valid == false){
        System.out.println("\nUN and/or password does not exist");
}}
}
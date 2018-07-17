
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Todd
 */
class Validate {

    static boolean checkUser(String email, String pass) {
        boolean valid = false;
        if (email.equals("trhoads@byui.edu") && pass.equals("12345"))
        {
         return valid = true;
        }
        else
        {
        return false;
        }
  } 
    
}

    
    


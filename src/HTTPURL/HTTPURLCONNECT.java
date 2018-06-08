/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTPURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Todd
 */
public class HTTPURLCONNECT {
    
    
    public static void main(String[] args) {
       
     
     try {
//           URL url = new URL("https://outlook.com");
         URL url = new URL("http://api.open-notify.org/astros.json");
       HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // url.openConnection(); is cast to HttpURLConnection
          connection.setRequestMethod("GET");
          connection.setRequestProperty("User-Agent", "Chrome");
           connection.setReadTimeout(2000);
              connection.connect();

           int responseCode = connection.getResponseCode();
          System.out.println("Response code: " + responseCode);
          
          if (responseCode != 200){
             System.out.println("Error connecting to page");
            return;
          }
          
          BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
          String line;
          while((line = input.readLine()) != null){
         
         System.out.println(line);
         }
        
        
          
         
          
          
         
       
         
         input.close();
         
           
      } catch (IOException ex) {
System.out.println("IOException: " + ex.getMessage());
       }
  }
}
       
  
   



    


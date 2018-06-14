/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTPURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.tests.TestObject;

/**
 *
 * @author Todd
 */
public class HTTPURLCONNECT {
    
    
    public static void main(String[] args) throws MalformedURLException, IOException, JSONException, ParseException, org.quickconnectfamily.json.ParseException {
       
    
     try {
//          URL url = new URL("https://outlook.com");
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
          System.out.println("JSON String from the API: \n");
         System.out.println(line + "\n");
         
          
    

    //Create a HashMap to pair the object attributes within the JSON file.
  HashMap objects = (HashMap) JSONUtilities.parse(line);
    
    
  //Get the array of people within the JSON String
   
   ArrayList <Astronaut> objects2= (ArrayList <Astronaut>) objects.get("people");
   
   
   
   //Iterate through the array and print out the Java Objects
   
   System.out.println("This is the array in Java Object form:\n");
   
   for (int i =0; i < objects2.size(); i++)
   {
    System.out.println(objects2.get(i) + "\n");
    }
   
    // Convert the objects back into JSON
   String  jsonString = JSONUtilities.stringify(objects2);
   System.out.println("This is the people array back in JSON format: \n");
   System.out.println(jsonString);
          }
    
    input.close();
    
         
        
   
           
     } catch (IOException ex) {
System.out.println("IOException: " + ex.getMessage());
       
  
     }
    } 
}
    



    

 
        


                
    
   


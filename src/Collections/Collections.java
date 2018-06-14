/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class Collections {
    
    
     public static void main(String[] args) 
     {
          HashMap <State, String> stateGovenors = new HashMap <State, String>();
         //Creating State Objects
         State NJ = new State();
         NJ.setName("New Jersey");
         NJ.setPopulation("8.8 million");
         NJ.setCapital("Trenton");
        
         State TN = new State();
         TN.setCapital("Nashville");
         TN.setName("Tennessee");
         TN.setPopulation("6.8 million");
         
         State SC = new State();
         SC.setName("South Carolina");
         SC.setCapital("Columbia");
         SC.setPopulation("5 million");
         
         State CA = new State();
         CA.setName("California");
         CA.setCapital("Sacramento");
         CA.setPopulation("39.5 million");
         
         //Creating an ArrayList and adding the states to it
         
         ArrayList<State>states = new ArrayList<State>();
         
         states.add(CA);
         states.add(NJ);
         states.add(TN);
         states.add(SC);
         
         //Looping through the array and outputting it.
         
         for (int i= 0; i< states.size(); i++){
         
         System.out.println("Name: " + states.get(i).getName());
         System.out.println("Population: " + states.get(i).getPopulation());
         System.out.println("Capital: " + states.get(i).getCapital() + "\n");
         
         
         }
         
         // Removing states and showing that it worked.
         states.remove(CA);
         states.remove(NJ);
         
         System.out.println("CA and NJ have been taken from the list.");
         for (int i= 0; i< states.size(); i++){
         
         System.out.println("Name: " + states.get(i).getName());
         System.out.println("Population: " + states.get(i).getPopulation());
         System.out.println("Capital: " + states.get(i).getCapital());
         System.out.println(" ");
         
         }
         
     stateGovenors.put(SC, "Henry McMaster");
     stateGovenors.put(NJ, "Phil Murphy"); 
     stateGovenors.put(CA, "Jerry Brown");
     stateGovenors.put(TN, "Bill Haslam \n"); 
     
     System.out.println("Search for a govenor using the State's Postal Initials");
     Scanner scanner = new Scanner(System.in);
     String input = scanner.nextLine();
     input.toUpperCase();
     State state = new State();
     
     switch(input){
                    case "SC":
                        state = SC;
                        break;
                    case "NJ" : 
                        state = NJ;
                        break;
                    case "TN" : 
                        state = TN;
                        break;    
                    case "CA" : 
                        state = CA;
                        break;
                    default:  
                        System.out.println("Please enter the states of CA, NJ, TN, or SC in uppercase.");
     }
     
     System.out.println(" ");
     System.out.println("The govenor of " + state.getName() + " is " + stateGovenors.get(state) + "\n");
      
     
     
      //  The hash set is created and initialized. 
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("New Jersey");
        hashSet.add("Tennessee");
        hashSet.add("South Carolina");
        hashSet.add("California");
        
        System.out.print("Hash Set results\n\n");
 
        System.out.println(hashSet + "\n");
 
        // Hash Set passed into the Tree Set to be sorted
        System.out.print("TreeSet sorts the hash set into alphabetical order. \n \n");
        Set<String> treeSet = new TreeSet<String>(hashSet);
        System.out.println(treeSet + "\n");
        
        
        //LinkedList 
        
        Queue queueA = new LinkedList();
        
        queueA.add("CA");
        queueA.add("NJ");
        queueA.add("SC");
        queueA.add("TN");
        

    
    for (Object temp : queueA) {
    System.out.println(temp);
}
}
}

     

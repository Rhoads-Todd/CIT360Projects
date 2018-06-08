/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsNExecutors;

/**
 *
 * @author Todd
 */
public class Thread3 implements Runnable {

  
    public void run() {
      
       
        System.out.println("This is Thread 3");
        if (Thread.activeCount() == 1)
        {
          System.out.println("There is " + Thread.activeCount() + " THREAD running");
        }
        
        else {
            System.out.println("There are " + Thread.activeCount() + " THREADS running");
    }
        
    }
    
}

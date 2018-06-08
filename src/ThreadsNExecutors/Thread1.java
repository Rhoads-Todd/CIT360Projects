/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsNExecutors;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Todd
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
       } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        this.setName("Thread 1");
         System.out.println(this.getName());
         
         
          if (Thread.activeCount() == 1)
        {
          System.out.println("There is " + Thread.activeCount() + " THREAD running");
        }
        
        else {
            System.out.println("There are " + Thread.activeCount() + " THREADS running");
    }
        
    }
    
    
}

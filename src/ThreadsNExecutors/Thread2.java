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
public class Thread2 extends Thread{

    @Override
    public void run() {
        this.setName("Thread 2");
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

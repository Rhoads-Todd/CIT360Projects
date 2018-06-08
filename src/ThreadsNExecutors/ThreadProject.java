/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsNExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 *
 * @author Todd
 */
public class ThreadProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
     
      
      
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        Thread3 runnable = new Thread3();
        Thread thread3 = new Thread(runnable);
        
      ExecutorService executorService =  newFixedThreadPool(2);
        
        
       executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        
        executorService.shutdown();
        
        
        ExecutorService executorService2 = newCachedThreadPool();
        executorService2.execute(thread3);
        executorService2.execute(thread3);
        
        executorService2.shutdown();
        
    }
    
    
}
   
    
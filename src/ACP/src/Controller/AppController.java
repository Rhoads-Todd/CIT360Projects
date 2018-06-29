/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.HashMap;

/**
 *
 * @author Todd
 */
public class AppController {
    
    
    private HashMap<String, Handler> handlerMap = new HashMap();
    
    public void handleRequest (String command, HashMap<String, Object> data) {
        Handler commandHandler = handlerMap.get(command);
        if (commandHandler != null){
            commandHandler.execute(data);
        }
    }
    
    public void mapCommand(String command, Handler commandHandler) {
        handlerMap.put(command, commandHandler);
    }
    
}


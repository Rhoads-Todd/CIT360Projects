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
public interface Handler {
    
    public void execute(HashMap<String, Object> data);
}


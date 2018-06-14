/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTPURL;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Todd
 */
public class Astronaut implements Serializable{
    String name;
    String spacecraft;

    public Astronaut(String name, String spacecraft) {
        this.name = name;
        this.spacecraft = spacecraft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpacecraft() {
        return spacecraft;
    }

    public void setSpacecraft(String spacecraft) {
        this.spacecraft = spacecraft;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.spacecraft);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Astronaut other = (Astronaut) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.spacecraft, other.spacecraft)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Astronaut{" + "name=" + name + ", spacecraft=" + spacecraft + '}';
    }
    
    

   
}

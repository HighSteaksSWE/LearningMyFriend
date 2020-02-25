/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
/**
 *
 * @author mariashehata
* 
 */

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;

abstract class Object {
    
    private  IntegerProperty x = new SimpleIntegerProperty(this, "x", 50);
    private  IntegerProperty y = new SimpleIntegerProperty(this, "y", 50);
    private  BooleanProperty display = new SimpleBooleanProperty(this, "display", false);

    public Object() {
    }
    
    
// getters
    public IntegerProperty getX() {
        return x;
    }

    public IntegerProperty getY() {
        return y;
    }

    public BooleanProperty getDisplay() {
        return display;
    }

    
// setters
    public void setX(int x){
        this.x.set(x);
    }

    public void setY(int y){
        this.y.set(y);
    }
    
    public void setDsiplay(Boolean bool){
        this.display.set(bool);
    }
    

}

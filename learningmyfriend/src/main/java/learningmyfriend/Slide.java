
package project2;
/**
 *
 * @author mariashehata
 */
import java.io.*; 
import java.util.*; 
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;

public class Slide {
    
    private IntegerProperty ID = new SimpleIntegerProperty(this, "ID", 0);
    ArrayList<Object> objectsList = new ArrayList<Object>();

    public Slide() {
    }
    
// add object
    public void addObject(Object object) {
        objectsList.add(object);
    }
    
// getters
    public IntegerProperty getID() {
        return ID;
    }
     

    public ArrayList<Object> getObjectsList() {
        return objectsList;
    }

// setters
    public void setObjectsList(ArrayList<Object> objectsList) {
        this.objectsList = objectsList;
    }

    public void setID(int num) {
        this.ID.set(num);
    }
    
}

package project2;
import java.io.*; 
import java.util.*; 
import java.util.Stack;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Text extends Object{

    private  StringProperty text ;
    //public Stack<event> stackOfEvents = new Stack<>();
    
    
    public Text(String name) { 
      
      this.text = new SimpleStringProperty(this, name , "");
    }

// set text value
    public void setText(String text) {
        this.text.setValue(text) ;
    }

    public StringProperty getText() {
        return text;
    }
    
    
}

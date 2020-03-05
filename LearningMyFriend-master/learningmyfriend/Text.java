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

    private  StringProperty text = new SimpleStringProperty(this, "text", "");
    private IntegerProperty size = new SimpleIntegerProperty(this, "size", 12);
    //public Stack<event> stackOfEvents = new Stack<>();
    
    
    public Text() {     
    }

    public void setText(StringProperty text) {
        this.text = text;
    }

    public StringProperty getText() {
        return text;
    }
    
    
}

package learningmyfriend;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Text extends Object {

    private StringProperty text;
    private String name;
    //public Stack<event> stackOfEvents = new Stack<>();

    public Text(String name) {
        this.name = name;
        this.text = new SimpleStringProperty(this, name, "");
    }

// set text value
    public void setText(String text) {
        this.text.setValue(text);
    }

    public StringProperty getText() {
        return text;
    }

    public String getName() {
        return name;
    }
}

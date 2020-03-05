package learningmyfriend;

import java.io.*; 
import java.util.*; 
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleListProperty;

public class SlidesDeck {
    //public ListProperty<Priority> choice
    SimpleListProperty<Slide> slidesList = new SimpleListProperty<Slide>() ;

    public SlidesDeck() {
    }


    public SimpleListProperty<Slide> getSlidesList() {
        return slidesList;
    }

    public void addSlide(Slide slide) {
         slidesList.add(slide);
    }
    
}

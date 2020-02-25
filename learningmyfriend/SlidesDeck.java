package project2;

import java.io.*; 
import java.util.*; 
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;

public class SlidesDeck {
    
    ArrayList<Slide> slidesList = new ArrayList<Slide>();

    public SlidesDeck() {
    }

    
    public void setSlidesList(ArrayList<Slide> slidesList) {
        this.slidesList = slidesList;
    }

    public ArrayList<Slide> getSlidesList() {
        return slidesList;
    }

    public void addSlide(Slide slide) {
         slidesList.add(slide);
    }
    
}

package learningmyfriend;

import com.dukescript.api.javafx.beans.FXBeanInfo;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import static net.java.html.json.Models.applyBindings;
import javafx.beans.property.SimpleListProperty;

public final class Demo implements FXBeanInfo.Provider {
    private SlidesDeck slideDeck = new SlidesDeck();
    private final IntegerProperty textCount = new SimpleIntegerProperty(this, "textCount");
    private final IntegerProperty slideCount = new SimpleIntegerProperty(this, "slideCount");
    private SimpleListProperty<Slide> slidesList = new SimpleListProperty<Slide>() ;
    
    // text count
    void increaseTextCount() {
        textCount.setValue(textCount.get() + 1);
    }
    // add slide
    void addSlide(){
        Slide slide = new Slide();
        slideCount.setValue(slideCount.get()+1) ;
        slide.ID.setValue(slideCount.get());
        slideDeck.addSlide(slide);
        this.getSlides();
    }
    
    // get slide List
    void getSlides(){
        slidesList = slideDeck.getSlidesList();
    }
    
    private final FXBeanInfo info = FXBeanInfo.newBuilder(this)
            .property(textCount)
            .action("increaseTextCount", this::increaseTextCount)
            .property(slideCount)
            .action("addSlide", this::addSlide)
            .property(slidesList)
            .build();
    
    @Override
    public FXBeanInfo getFXBeanInfo() {
        return info;
    }
    
    public static void onPageLoad() {
        Demo model = new Demo();
        applyBindings(model);
    }
    
}

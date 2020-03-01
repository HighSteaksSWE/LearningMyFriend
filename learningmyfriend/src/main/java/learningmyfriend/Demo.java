package learningmyfriend;

import com.dukescript.api.javafx.beans.FXBeanInfo;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import static net.java.html.json.Models.applyBindings;

public final class Demo implements FXBeanInfo.Provider {
    private SlidesDeck slideDeck = new SlidesDeck();
    private final IntegerProperty textCount = new SimpleIntegerProperty(this, "textCount");
    private final IntegerProperty slideCount = new SimpleIntegerProperty(this, "slideCount");
    
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
    }
    
    private final FXBeanInfo info = FXBeanInfo.newBuilder(this)
            .property(textCount)
            .action("increaseTextCount", this::increaseTextCount)
            .property(slideCount)
            .action("addSlide", this::addSlide)
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

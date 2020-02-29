package learningmyfriend;

import com.dukescript.api.javafx.beans.FXBeanInfo;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import static net.java.html.json.Models.applyBindings;

public final class Demo implements FXBeanInfo.Provider {
    
    private final IntegerProperty textCount = new SimpleIntegerProperty(this, "textCount");
    
    void increaseTextCount() {
        textCount.setValue(textCount.get() + 1);
    }
    
    private final FXBeanInfo info = FXBeanInfo.newBuilder(this)
            .property(textCount)
            .action("increaseTextCount", this::increaseTextCount)
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

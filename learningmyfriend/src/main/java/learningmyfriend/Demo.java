package learningmyfriend;

import com.dukescript.api.javafx.beans.FXBeanInfo;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import static net.java.html.json.Models.applyBindings;

public final class Demo implements FXBeanInfo.Provider {
    
    private final StringProperty desc = new SimpleStringProperty(this, "desc", "Buy Milk");
    private final ListProperty<String> todos = new SimpleListProperty<>(this, "todos", FXCollections.observableArrayList());
    private final IntegerBinding numTodos = Bindings.createIntegerBinding(todos::size, todos);
    private final IntegerProperty textCount = new SimpleIntegerProperty(1);
    private final ObservableValue<String> createText = Bindings.createObjectBinding(() -> {
        textCount.set(textCount.get() + 1);
        return "text" + textCount.get();
    }, textCount);
    
    public String createText() {
        String textName = "text" + textCount.get();
        System.out.println(textCount);
        textCount.setValue(45);
        System.out.println(textCount);
        System.out.println(textCount);
        return textName;
    }
    
    void addTodo() {
        todos.getValue().add(desc.getValue());
        desc.setValue("");
    }
    
    private final FXBeanInfo info = FXBeanInfo.newBuilder(this)
            .property(desc)
            .property(todos)
            .property(textCount)
            .property("numTodos", numTodos)
            .action("addTodo", this::addTodo)
            .property("createText", createText)
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

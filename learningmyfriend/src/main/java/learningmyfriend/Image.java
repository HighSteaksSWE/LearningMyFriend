/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningmyfriend;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Arrays;
import java.util.stream.StreamSupport;
import java.io.IOException;
import static java.nio.file.StandardCopyOption.*;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;


/**
*
* @author Tyrell Daniels
*/
public class Image extends Object{

    //private String imagePath, targetImagePath;
    private Path here, there;
    //StringProperty filePath = new SimpleStringProperty(this, "test", "");
    private String fileName;

    public Image(){

        //this.there = Paths.get("C:\\Users\\HNS1Lab.NETWORK\\Pictures\\OculusScreenshot1572893034.jpeg");

        //String[] paths = splitPath(this.there.toString());
        //Arrays.toString(paths);

        //for (String name: paths){
            //this.fileName = name;
        //}

        //this.here = Paths.get("C:\\Users\\HNS1Lab.NETWORK\\Downloads\\Images\\" + this.fileName);
    }

    public Path getImagePath() {
        return this.there;
    }

    public Path getNewImagePath() {
        return this.here;
    }

    public void setImagePath(String ImagePath) {
        this.there = Paths.get(ImagePath);

        String[] paths = splitPath(this.there.toString());
        Arrays.toString(paths);

        for (String name: paths){
            this.fileName = name;
        }

        this.here = Paths.get("C:\\Users\\HNS1Lab.NETWORK\\Downloads\\Images\\" + this.fileName);
    }

    public void copyImage(){
        try{
            Files.copy(this.there, this.here, REPLACE_EXISTING);
        }
        catch(Exception e){
        }
    }
    
    /**
     *
     * @author https://www.logicbig.com/how-to/java-io/split-path.html
     */
    public static String[] splitPath(String pathString) {
        Path path = Paths.get(pathString);
        return StreamSupport.stream(path.spliterator(), false).map(Path::toString)
                .toArray(String[]::new);
    }

}

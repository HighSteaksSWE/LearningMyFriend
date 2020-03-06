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
public class Sound extends Object{

    //private String imagePath, targetImagePath;
    private Path here, there;
    //StringProperty filePath = new SimpleStringProperty(this, "test", "");
    private String fileName;

    public Sound(){

        //this.there = Paths.get("C:\\Users\\HNS1Lab.NETWORK\\Videos\\JuiceWRLD.mp3");

        //String[] paths = splitPath(this.there.toString());
        //Arrays.toString(paths);

        //for (String name: paths){
            //this.fileName = name;
        //}

        //this.here = Paths.get("C:\\Users\\HNS1Lab.NETWORK\\Downloads\\Sounds\\" + this.fileName);
    }

    public Path getSoundPath() {
        return this.there;
    }

    public Path getNewSoundPath() {
        return this.here;
    }

    public void setSoundPath(String SoundPath) {
        this.there = Paths.get(SoundPath);

        String[] paths = splitPath(this.there.toString());
        Arrays.toString(paths);

        for (String name: paths){
            this.fileName = name;
        }

        this.here = Paths.get("C:\\Users\\HNS1Lab.NETWORK\\Downloads\\test\\" + this.fileName);
    }

    public void copySound(){
        try{
            Files.copy(this.there, this.here, REPLACE_EXISTING);
        }
        catch(Exception e){}
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

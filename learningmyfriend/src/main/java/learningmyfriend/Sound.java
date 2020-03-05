/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningmyfriend;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Tyrell Daniels
 */
public class Sound extends Object{
    
    //private String imagePath, targetImagePath;
    private Path here, there, here2, there2;
    
    public Sound(){
        //this.imagePath = "C:\\Users\\HNS1Lab.NETWORK\\Pictures\\OculusScreenshot1572893015.jpeg";
        //this.targetImagePath = "\\Images";
        
        there = Paths.get("C:\\Users\\HNS1Lab.NETWORK\\Videos\\JuiceWRLD.mp3");
        here = Paths.get("\\Sounds");
        
        try{
            Files.copy(this.there, this.here, REPLACE_EXISTING);
        }
        catch(Exception e){}
    }

    public Path getSoundPath() {
        return there;
    }

    public void setSoundPath(Path SoundPath) {
        this.there = SoundPath;
    }

   
    
}

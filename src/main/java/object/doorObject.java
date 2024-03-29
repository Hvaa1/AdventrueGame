/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author DELL
 */
public class doorObject extends SuperObject {
    public doorObject(){
        name = "Door";
        try{
           image = ImageIO.read(new File("res/object/door.png"));  
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

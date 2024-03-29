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
public class chestObject extends SuperObject {
    public chestObject(){
        name = "Chest";
        try{
           image = ImageIO.read(new File("res/object/Chest 1.png"));  
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

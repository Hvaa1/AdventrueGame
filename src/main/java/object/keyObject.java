/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;

/**
 *
 * @author DELL
 */
public class keyObject extends SuperObject {
    public keyObject(){
        name = "Key";
        try{
           image = ImageIO.read(new File("res/object/Key01.png"));  
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

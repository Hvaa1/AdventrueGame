/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import object.chestObject;
import object.doorObject;
import object.keyObject;

/**
 *
 * @author DELL
 */
public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(){
        gp.obj[0] = new keyObject();
        gp.obj[0].worldX = gp.titleSize * 42;
        gp.obj[0].worldY = gp.titleSize * 22;
        gp.obj[1] = new keyObject();
        gp.obj[1].worldX = gp.titleSize * 23;
        gp.obj[1].worldY = gp.titleSize *7;
        gp.obj[2] = new doorObject();
        gp.obj[2].worldX = gp.titleSize *10;
        gp.obj[2].worldY = gp.titleSize * 11;
        gp.obj[3] = new chestObject();
        gp.obj[3].worldX = gp.titleSize *10;
        gp.obj[3].worldY = gp.titleSize * 8;
        
    }
}

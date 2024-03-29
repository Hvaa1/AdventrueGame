/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author DELL
 */
public class Entity {
    public int worldX,worldY;
    public int speed;
    public String direction;
    public BufferedImage up1,up2,down1,down2,right1,right2,left1,left2,upLeft1,upLeft2,upRight1,upRight2,downRight1,downRight2,downLeft1,downLeft2;
    public int spriteNum = 1;
    public int spriteCount = 0;
    public Rectangle solidArea;
    public boolean collisionOn = false; 
}


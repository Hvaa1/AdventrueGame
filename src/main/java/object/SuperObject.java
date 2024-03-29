/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import main.GamePanel;

/**
 *
 * @author DELL
 */
public class SuperObject  {
    public BufferedImage image;
    public String name;
    public boolean collision = false ;
    public int worldX,worldY;
    public void draw(Graphics2D g2D , GamePanel gp){
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;
        if (worldX + gp.titleSize > gp.player.worldX - gp.player.screenX &&
                worldY - gp.titleSize < gp.player.worldY + gp.player.screenY &&
                worldX - gp.titleSize < gp.player.worldX + gp.player.screenX &&
                worldY + gp.titleSize > gp.player.worldY - gp.player.screenY)
            {
                g2D.drawImage(image, screenX, screenY,gp.titleSize,gp.titleSize, null);
            }
    }
}

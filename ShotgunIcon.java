import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class ShotgunIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotgunIcon extends WeaponIcon
{
    public ShotgunIcon()
    {
        GreenfootImage imageShotgun = getImage();
        imageShotgun.scale(300, 150);
    }
    
    /**
     * Act - do whatever the ShotgunIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* Part of the HUD. Shows what gun the player is equipped.*/
    }
}

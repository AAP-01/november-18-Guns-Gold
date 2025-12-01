import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rifle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rifle extends Actor
{
    public Rifle()
    {
        setRotation(-30);
        GreenfootImage imageRifle = getImage();
        imageRifle.scale(100, 25);
    }
    
    /**
     * Act - do whatever the Shotgun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        obtainedRifle();
    }
    
    public void obtainedRifle()
    {
        Actor player = getOneIntersectingObject(Player.class);
        
        if(player != null)
        {
            RifleIcon rifleIcon = new RifleIcon();
            getWorld().addObject(rifleIcon, 175, 120);
            
            if(((Player)player).getGunType() == "Pistol")
            {
                PistolIcon pistolIcon = (PistolIcon) getWorld().getObjects(PistolIcon.class).get(0);
                getWorld().removeObject(pistolIcon);
            }
            else if(((Player)player).getGunType() == "Shotgun")
            {
                ShotgunIcon shotgunIcon =  (ShotgunIcon) getWorld().getObjects(ShotgunIcon.class).get(0);
                getWorld().removeObject(shotgunIcon);
            }
            
            ((Player)player).setGunType("Rifle");
            Greenfoot.playSound("shotgun equipped (edited, trimmed).wav");
            
            getWorld().removeObject(this);
        }
    }
}

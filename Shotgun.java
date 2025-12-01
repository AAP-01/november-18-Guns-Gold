import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shotgun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shotgun extends Actor
{
    public Shotgun()
    {

        setRotation(-30);
        GreenfootImage imageShotgun = getImage();
        imageShotgun.scale(150, 75);
    }
    
    /**
     * Act - do whatever the Shotgun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        obtainedShotgun();
    }
    
    public void obtainedShotgun()
    {
        Actor player = getOneIntersectingObject(Player.class);
        
        if(player != null)
        {
            ShotgunIcon shotgunIcon = new ShotgunIcon();
            getWorld().addObject(shotgunIcon, 150, 120);
            
            if(((Player)player).getGunType() == "Pistol")
            {
                PistolIcon pistolIcon = (PistolIcon) getWorld().getObjects(PistolIcon.class).get(0);
                getWorld().removeObject(pistolIcon);
            }
            else if(((Player)player).getGunType() == "Rifle")
            {
                RifleIcon rifleIcon =  (RifleIcon) getWorld().getObjects(RifleIcon.class).get(0);
                getWorld().removeObject(rifleIcon);
            }
            
            ((Player)player).setGunType("Shotgun");
            Greenfoot.playSound("shotgun equipped (edited, trimmed).wav");
            
            getWorld().removeObject(this);
        }
    }
}

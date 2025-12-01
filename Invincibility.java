import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Invincibility here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invincibility extends Boosts
{
    /**
     * Act - do whatever the Invincibility wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        obtainedInvincibility();
    }
    
    public void obtainedInvincibility()
    {
        Actor player = getOneIntersectingObject(Player.class);
        
        if(player != null)
        {
            SpeedBoostIcon speedBoostIcon = new SpeedBoostIcon();
            getWorld().addObject(speedBoostIcon, 175, 120);
            ((Player)player).setBoost("Invincibility");
            
            getWorld().removeObject(this);
        }
    }
}

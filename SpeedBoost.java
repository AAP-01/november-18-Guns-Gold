import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedBoost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedBoost extends Boosts
{
    /**
     * Act - do whatever the SpeedBoost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        obtainedSpeedBoost();
    }
    
    public void obtainedSpeedBoost()
    {
        Actor player = getOneIntersectingObject(Player.class);
        
        if(player != null)
        {
            SpeedBoostIcon speedBoostIcon = new SpeedBoostIcon();
            getWorld().addObject(speedBoostIcon, 175, 120);
            ((Player)player).setBoost("Speed Boost");
            
            getWorld().removeObject(this);
        }
    }
}

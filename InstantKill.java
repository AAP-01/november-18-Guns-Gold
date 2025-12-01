import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstantKill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstantKill extends Boosts
{
    /**
     * Act - do whatever the InstantKill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        obtainedInstantKill();
    }
    
    public void obtainedInstantKill()
    {
        Actor player = getOneIntersectingObject(Player.class);
        
        if(player != null)
        {
            SpeedBoostIcon speedBoostIcon = new SpeedBoostIcon();
            getWorld().addObject(speedBoostIcon, 175, 120);
            ((Player)player).setBoost("Instant Kill");
            
            getWorld().removeObject(this);
        }
    }
}

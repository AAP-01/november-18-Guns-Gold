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
            InvincibilityIcon invincibilityIcon = new InvincibilityIcon();
            getWorld().addObject(invincibilityIcon, 300, 50);
            
            if(((Player)player).getBoost() == "Instant Kill")
            {
                InstantKillIcon instantKillIcon =  (InstantKillIcon) getWorld().getObjects(InstantKillIcon.class).get(0);
                getWorld().removeObject(instantKillIcon);
            }
            else if(((Player)player).getBoost() == "Speed Boost")
            {
                SpeedBoostIcon speedBoostIcon = (SpeedBoostIcon) getWorld().getObjects(SpeedBoostIcon.class).get(0);
                getWorld().removeObject(speedBoostIcon);
            }
            
            ((Player)player).setBoost("Invincibility");
            
            getWorld().removeObject(this);
        }
    }
}

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
            InstantKillIcon InstantKillIcon = new InstantKillIcon();
            getWorld().addObject(InstantKillIcon, 300, 50);
            
            if(((Player)player).getBoost() == "Invincibility")
            {
                InvincibilityIcon invincibilityIcon = (InvincibilityIcon) getWorld().getObjects(InvincibilityIcon.class).get(0);
                getWorld().removeObject(invincibilityIcon);
            }
            else if(((Player)player).getBoost() == "Speed Boost")
            {
                SpeedBoostIcon speedBoostIcon = (SpeedBoostIcon) getWorld().getObjects(SpeedBoostIcon.class).get(0);
                getWorld().removeObject(speedBoostIcon);
            }
            
            ((Player)player).setBoost("Instant Kill");
            
            getWorld().removeObject(this);
        }
    }
}

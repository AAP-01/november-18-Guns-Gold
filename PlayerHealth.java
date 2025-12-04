import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerHealth extends Player
{
    private Player player;
    
    public PlayerHealth(Player player)
    {
        this.player = player;
        GreenfootImage imageheart = getImage();
        imageheart.scale(50, 50);
    }
    
    /**
     * Act - do whatever the PlayerHealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void heartStatus(double halfHeart, double emptyHeart)
    {
        if(player.playerHealth == halfHeart)
        {
            setImage("Half Heart(edited, scaled down, painted).png");
        }
        else if(player.playerHealth <= emptyHeart)
        {
            setImage("Empty Heart(edited, scaled down, painted).png");
        }
    }
}

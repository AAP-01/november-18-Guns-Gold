import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Replay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Replay extends EndScreenButtons
{
    public Replay()
    {
        
    }
    
    /**
     * Act - do whatever the Replay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.setImage("Replay Selected.png", "Replay.png");
        replayLevel();
    }
    
    public void replayLevel()
    {
        switch(Levels.getWhichLevel())
        {
            case "Level1":
                if (Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Level1());
                }
                break;
            case "Level2":
                if (Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Level2());
                }
                break;
            case "Level3":
                if (Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new Level3());
                }
                break;
        }
    }
}

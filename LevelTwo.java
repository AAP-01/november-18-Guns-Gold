import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends MainMenuButtons
{
    /**
     * Act - do whatever the LevelTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.setImage("Level 2 Selected.png", "Level 2.png");
        playLevel();
    }
    
    public void playLevel()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level2());
            
            MainScreen mainScreen = (MainScreen) getWorld();
            mainScreen.stopped();
        }
    }
}

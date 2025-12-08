import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends MainMenuButtons
{
    /**
     * Act - do whatever the LevelOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.setImage("Level 1 Selected.png", "Level 1.png");
        playLevel();
    }
    
    public void playLevel()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1());
            
            MainScreen mainScreen = (MainScreen) getWorld();
            mainScreen.stopped();
        }
    }
}

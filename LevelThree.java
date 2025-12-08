import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends MainMenuButtons
{
    /**
     * Act - do whatever the LevelThree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.setImage("Level 3 Selected.png", "Level 3.png");
        playLevel();
    }
    
    public void playLevel()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level3());
            
            MainScreen mainScreen = (MainScreen) getWorld();
            mainScreen.stopped();
        }
    }
}

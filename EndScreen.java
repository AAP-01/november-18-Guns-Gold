import greenfoot.*;

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
    private String whichLevel;
    
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Replay replay = new Replay();
        addObject(replay,300,825);
        ReturnToMenu returnToMenu = new ReturnToMenu();
        addObject(returnToMenu,700,825);
    }
}

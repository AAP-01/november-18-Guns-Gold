import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    private double timeWelcomeScreenCreation = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1);
        showText("Game Programming 1", 500, 100);
        showText("Game by:", 500, 600);
        showText("John Benedict Castroverde", 500, 650);
        showText("Megh Patel", 500, 670);
        prepare();
    }

    public void act()
    {
        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;

        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (5 * 1000)))
        {
            Greenfoot.setWorld(new MainScreen()); 
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        VanierLogo vanierLogo = new VanierLogo();
        addObject(vanierLogo,500,850);
    }
}

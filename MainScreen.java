import greenfoot.*;

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends World
{
    private GreenfootSound mainScreenMusic;

    /**
     * Constructor for objects of class MainScreen
     */
    public MainScreen()
    {
        super(1000, 1000, 1);
        prepare();
        mainScreenMusic = new GreenfootSound("Main Screen music.mp3");
    }
    
    public void started()
    {
        mainScreenMusic.playLoop();
    }
    
    public void stopped()
    {
        mainScreenMusic.stop();
    }
    
    public void act()
    {
        started();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelOne levelOne = new LevelOne();
        addObject(levelOne, 200, 800);
        LevelTwo levelTwo = new LevelTwo();
        addObject(levelTwo, 500, 800);
        LevelThree levelThree = new LevelThree();
        addObject(levelThree, 800, 800);
    }
}

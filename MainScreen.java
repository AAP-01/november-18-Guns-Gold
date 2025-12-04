import greenfoot.World;

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends World
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MainScreen
     */
    public MainScreen()
    {
        super(1000, 1000, 1);
        prepare();
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

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {     
        prepare();
        whichLevel = "Level2";
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,679,614);

        Heart1 heart1 =  new  Heart1(player);
        addObject(heart1, 190, 50);
        Heart2 heart2 =  new  Heart2(player);
        addObject(heart2, 120, 50);
        Heart3 heart3 =  new  Heart3(player);
        addObject(heart3, 50, 50);

        PistolIcon pistolIcon =  new  PistolIcon();
        addObject(pistolIcon, 75, 120);

        Bandit bandit = new Bandit();
        addObject(bandit,528,280);
        Bandit bandit2 = new Bandit();
        addObject(bandit2,319,412);
        Bandit bandit3 = new Bandit();
        addObject(bandit3,377,689);
        Treasure treasure = new Treasure();
        addObject(treasure,791,173);
        Treasure treasure2 = new Treasure();
        addObject(treasure2,579,135);
        Treasure treasure3 = new Treasure();
        addObject(treasure3,330,117);
        Treasure treasure4 = new Treasure();
        addObject(treasure4,150,237);
        Treasure treasure5 = new Treasure();
        addObject(treasure5,143,453);
        Treasure treasure6 = new Treasure();
        addObject(treasure6,133,699);
        Treasure treasure7 = new Treasure();
        addObject(treasure7,242,861);
        Treasure treasure8 = new Treasure();
        addObject(treasure8,738,875);
        Treasure treasure9 = new Treasure();
        addObject(treasure9,816,804);
        Treasure treasure10 = new Treasure();
        addObject(treasure10,806,567);
        Juggernaut juggernaut = new Juggernaut();
        addObject(juggernaut,555,493);
    }
}

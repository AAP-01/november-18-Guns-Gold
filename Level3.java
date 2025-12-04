import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        prepare();
        whichLevel = "Level2";
    }
    
    private void prepare()
    {
        Player player =  new  Player();
        addObject(player, 500, 500);

        Heart1 heart1 =  new  Heart1(player);
        addObject(heart1, 190, 50);
        Heart2 heart2 =  new  Heart2(player);
        addObject(heart2, 120, 50);
        Heart3 heart3 =  new  Heart3(player);
        addObject(heart3, 50, 50);

        Bandit bandit =  new  Bandit();
        addObject(bandit, 243, 797);
        Bandit bandit2 = new Bandit();
        addObject(bandit2,800,874);
        Bandit bandit3 = new Bandit();
        addObject(bandit3,786,195);

        PistolIcon pistolIcon =  new  PistolIcon();
        addObject(pistolIcon, 75, 120);

        Crate crate = new Crate();
        addObject(crate,0,210);
        Crate crate2 = new Crate();
        addObject(crate2,75,210);
        Crate crate3 = new Crate();
        addObject(crate3,175,210);
        Crate crate4 = new Crate();
        addObject(crate4,275,210);
        Crate crate5 = new Crate();
        addObject(crate5,375,210);
        Crate crate6 = new Crate();
        addObject(crate6,375,110);
        Crate crate7 = new Crate();
        addObject(crate7,375,10);
    }
}

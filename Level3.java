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
        addObject(crate,25,190);
        Crate crate2 = new Crate();
        addObject(crate2,75,190);
        Crate crate3 = new Crate();
        addObject(crate3,125,190);
        Crate crate4 = new Crate();
        addObject(crate4,175,190);
        Crate crate5 = new Crate();
        addObject(crate5,225,190);
        Crate crate6 = new Crate();
        addObject(crate6,275,190);
        Crate crate7 = new Crate();
        addObject(crate7,325,190);
        Crate crate8 = new Crate();
        addObject(crate8,375,190);
        Crate crate9 = new Crate();
        addObject(crate9,375,140);
        Crate crate10 = new Crate();
        addObject(crate10,375,90);
        Crate crate11 = new Crate();
        addObject(crate11,375,40);
        Crate crate12 = new Crate();
        addObject(crate12,375,0);
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level1 extends Levels
{
    /**
     * Constructor for objects of class MyWorld.
     */
    public Level1()
    {
        prepare();
        whichLevel = "Level1";
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
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

        Treasure treasure =  new  Treasure();
        addObject(treasure, 626, 177);
        Treasure treasure2 =  new  Treasure();
        addObject(treasure2, 117, 446);
        Treasure treasure3 =  new  Treasure();
        addObject(treasure3, 818, 350);
        Treasure treasure4 =  new  Treasure();
        addObject(treasure4, 579, 900);
        Treasure treasure5 = new Treasure();
        addObject(treasure5,478,807);
        Treasure treasure6 = new Treasure();
        addObject(treasure6,142,680);
        treasure2.setLocation(214,535);
        Treasure treasure7 = new Treasure();
        addObject(treasure7,198,294);
        Treasure treasure8 = new Treasure();
        addObject(treasure8,220,31);

        Shotgun shotgun = new Shotgun();
        addObject(shotgun,546,692);
        Rifle rifle = new Rifle();
        addObject(rifle,479,295);
        Juggernaut juggernaut = new Juggernaut();
        addObject(juggernaut,342,401);
        Raider raider = new Raider();
        addObject(raider,552,852);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,158,897);
        Invincibility invincibility = new Invincibility();
        addObject(invincibility,720,503);
        InstantKill instantKill = new InstantKill();
        addObject(instantKill,322,285);
        Wall wall = new Wall();
        addObject(wall,297,52);
        Wall wall2 = new Wall();
        addObject(wall2,287,24);
        Wall wall3 = new Wall();
        addObject(wall3,17,139);
        Wall wall4 = new Wall();
        addObject(wall4,246,89);
        wall3.setLocation(152,178);
        removeObject(wall3);
        removeObject(wall4);
        removeObject(wall);
        removeObject(wall2);
    }
}

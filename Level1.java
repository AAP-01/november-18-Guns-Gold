import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level1 extends Levels
{ 
    private GreenfootSound level1Music;
    
    /**
     * Constructor for objects of class MyWorld.
     */
    public Level1()
    {
        prepare();
        whichLevel = "Level1";
        level1Music = new GreenfootSound("Level 1 music.mp3");
        level1Music.setVolume(60);
    }
    
    public void started()
    {
        level1Music.playLoop();
    }
    
    public void stopped()
    {
        level1Music.stop();
    }
    
    public void act()
    {
        started();
        if (Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new MainScreen());
            this.stopped();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player =  new  Player();
        addObject(player, 950,255);

        Heart1 heart1 =  new  Heart1(player);
        addObject(heart1, 190, 50);
        Heart2 heart2 =  new  Heart2(player);
        addObject(heart2, 120, 50);
        Heart3 heart3 =  new  Heart3(player);
        addObject(heart3, 50, 50);

        PistolIcon pistolIcon =  new  PistolIcon();
        addObject(pistolIcon, 75, 120);

        MossyWall mossyWall = new MossyWall();
        addObject(mossyWall,25,190);
        MossyWall mossyWall2 = new MossyWall();
        addObject(mossyWall2,75,190);
        MossyWall mossyWall3 = new MossyWall();
        addObject(mossyWall3,125,190);
        MossyWall mossyWall4 = new MossyWall();
        addObject(mossyWall4,175,190);
        MossyWall mossyWall5 = new MossyWall();
        addObject(mossyWall5,225,190);
        MossyWall mossyWall6 = new MossyWall();
        addObject(mossyWall6,275,190);
        MossyWall mossyWall7 = new MossyWall();
        addObject(mossyWall7,325,190);
        MossyWall mossyWall8 = new MossyWall();
        addObject(mossyWall8,375,190);
        MossyWall mossyWall9 = new MossyWall();
        addObject(mossyWall9,375,140);
        MossyWall mossyWall10 = new MossyWall();
        addObject(mossyWall10,375,90);
        MossyWall mossyWall11 = new MossyWall();
        addObject(mossyWall11,375,40);
        MossyWall mossyWall12 = new MossyWall();
        addObject(mossyWall12,375,0);
        MossyWall mossyWall13 = new MossyWall();
        addObject(mossyWall13,425,190);
        MossyWall mossyWall14 = new MossyWall();
        addObject(mossyWall14,475,190);
        MossyWall mossyWall15 = new MossyWall();
        addObject(mossyWall15,525,190);
        MossyWall mossyWall16 = new MossyWall();
        addObject(mossyWall16,575,190);
        MossyWall mossyWall17 = new MossyWall();
        addObject(mossyWall17,575,140);
        MossyWall mossyWall18 = new MossyWall();
        addObject(mossyWall18,575,90);
        MossyWall mossyWall19 = new MossyWall();
        addObject(mossyWall19,625,190);
        MossyWall mossyWall20 = new MossyWall();
        addObject(mossyWall20,675,190);
        MossyWall mossyWall21 = new MossyWall();
        addObject(mossyWall21,675,240);
        MossyWall mossyWall22 = new MossyWall();
        addObject(mossyWall22,725,190);
        MossyWall mossyWall23 = new MossyWall();
        addObject(mossyWall23,775,190);
        MossyWall mossyWall24 = new MossyWall();
        addObject(mossyWall24,925,190);
        MossyWall mossyWall25 = new MossyWall();
        addObject(mossyWall25,975,190);
        MossyWall mossyWall26 = new MossyWall();
        addObject(mossyWall26,775,40);
        MossyWall mossyWall27 = new MossyWall();
        addObject(mossyWall27,775,0);
        MossyWall mossyWall28 = new MossyWall();
        addObject(mossyWall28,675,290);
        MossyWall mossyWall29 = new MossyWall();
        addObject(mossyWall29,675,340);
        MossyWall mossyWall30 = new MossyWall();
        addObject(mossyWall30,625,340);
        MossyWall mossyWall31 = new MossyWall();
        addObject(mossyWall31,575,340);
        MossyWall mossyWall32 = new MossyWall();
        addObject(mossyWall32,725,340);
        MossyWall mossyWall33 = new MossyWall();
        addObject(mossyWall33,775,340);
        MossyWall mossyWall34 = new MossyWall();
        addObject(mossyWall34,925,340);
        MossyWall mossyWall35 = new MossyWall();
        addObject(mossyWall35,975,340);
        MossyWall mossyWall36 = new MossyWall();
        addObject(mossyWall36,225,240);
        MossyWall mossyWall37 = new MossyWall();
        addObject(mossyWall37,375,240);
        MossyWall mossyWall38 = new MossyWall();
        addObject(mossyWall38,375,290);
        MossyWall mossyWall39 = new MossyWall();
        addObject(mossyWall39,375,340);
        MossyWall mossyWall40 = new MossyWall();
        addObject(mossyWall40,375,390);
        MossyWall mossyWall41 = new MossyWall();
        addObject(mossyWall41,325,390);
        MossyWall mossyWall42 = new MossyWall();
        addObject(mossyWall42,275,390);
        MossyWall mossyWall43 = new MossyWall();
        addObject(mossyWall43,125,390);
        MossyWall mossyWall44 = new MossyWall();
        addObject(mossyWall44,75,390);
        MossyWall mossyWall45 = new MossyWall();
        addObject(mossyWall45,25,390);

        MossyWall mossyWall46 = new MossyWall();
        addObject(mossyWall46,325,540);
        MossyWall mossyWall47 = new MossyWall();
        addObject(mossyWall47,325,590);
        MossyWall mossyWall48 = new MossyWall();
        addObject(mossyWall48,325,640);
        MossyWall mossyWall49 = new MossyWall();
        addObject(mossyWall49,325,690);
        MossyWall mossyWall50 = new MossyWall();
        addObject(mossyWall50,375,590);
        MossyWall mossyWall51 = new MossyWall();
        addObject(mossyWall51,425,590);
        MossyWall mossyWall52 = new MossyWall();
        addObject(mossyWall52,475,590);
        MossyWall mossyWall53 = new MossyWall();
        addObject(mossyWall53,525,590);
        MossyWall mossyWall54 = new MossyWall();
        addObject(mossyWall54,575,590);
        MossyWall mossyWall55 = new MossyWall();
        addObject(mossyWall55,625,590);
        MossyWall mossyWall56 = new MossyWall();
        addObject(mossyWall56,675,590);
        MossyWall mossyWall57 = new MossyWall();
        addObject(mossyWall57,675,540);
        MossyWall mossyWall58 = new MossyWall();
        addObject(mossyWall58,725,540);
        MossyWall mossyWall59 = new MossyWall();
        addObject(mossyWall59,775,540);
        MossyWall mossyWall60 = new MossyWall();
        addObject(mossyWall60,825,540);
        MossyWall mossyWall61 = new MossyWall();
        addObject(mossyWall61,875,540);
        MossyWall mossyWall62 = new MossyWall();
        addObject(mossyWall62,875,590);
        MossyWall mossyWall63 = new MossyWall();
        addObject(mossyWall63,875,640);
        MossyWall mossyWall64 = new MossyWall();
        addObject(mossyWall64,675,490);
        MossyWall mossyWall65 = new MossyWall();
        addObject(mossyWall65,275,640);
        MossyWall mossyWall66 = new MossyWall();
        addObject(mossyWall66,225,640);
        MossyWall mossyWall67 = new MossyWall();
        addObject(mossyWall67,175,640);
        MossyWall mossyWall68 = new MossyWall();
        addObject(mossyWall68,175,590);
        MossyWall mossyWall69 = new MossyWall();
        addObject(mossyWall69,175,540);
        MossyWall mossyWall70 = new MossyWall();
        addObject(mossyWall70,125,640);
        MossyWall mossyWall71 = new MossyWall();
        addObject(mossyWall71,125,690);
        MossyWall mossyWall72 = new MossyWall();
        addObject(mossyWall72,125,740);
        MossyWall mossyWall73 = new MossyWall();
        addObject(mossyWall73,125,790);
        MossyWall mossyWall74 = new MossyWall();
        addObject(mossyWall74,125,840);
        MossyWall mossyWall75 = new MossyWall();
        addObject(mossyWall75,125,890);
        MossyWall mossyWall76 = new MossyWall();
        addObject(mossyWall76,175,890);

        MossyWall mossyWall77 = new MossyWall();
        addObject(mossyWall77,325,890);
        MossyWall mossyWall78 = new MossyWall();
        addObject(mossyWall78,325,940);
        MossyWall mossyWall79 = new MossyWall();
        addObject(mossyWall79,325,990);
        MossyWall mossyWall80 = new MossyWall();
        addObject(mossyWall80,375,890);
        MossyWall mossyWall81 = new MossyWall();
        addObject(mossyWall81,425,890);
        MossyWall mossyWall82 = new MossyWall();
        addObject(mossyWall82,425,840);
        MossyWall mossyWall83 = new MossyWall();
        addObject(mossyWall83,475,840);
        MossyWall mossyWall84 = new MossyWall();
        addObject(mossyWall84,625,740);
        MossyWall mossyWall85 = new MossyWall();
        addObject(mossyWall85,625,840);
        MossyWall mossyWall86 = new MossyWall();
        addObject(mossyWall86,625,890);
        MossyWall mossyWall87 = new MossyWall();
        addObject(mossyWall87,625,940);
        MossyWall mossyWall88 = new MossyWall();
        addObject(mossyWall88,625,990);
        MossyWall mossyWall89 = new MossyWall();
        addObject(mossyWall89,625,790);

        MossyWall mossyWall90 = new MossyWall();
        addObject(mossyWall90,875,840);
        MossyWall mossyWall91 = new MossyWall();
        addObject(mossyWall91,925,840);
        MossyWall mossyWall92 = new MossyWall();
        addObject(mossyWall92,975,840);
        MossyWall mossyWall93 = new MossyWall();
        addObject(mossyWall93,875,890);
        MossyWall mossyWall95 = new MossyWall();
        addObject(mossyWall95,675,840);

        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,56,960);

        InstantKill instantKill = new InstantKill();
        addObject(instantKill,474,114);

        Rifle rifle = new Rifle();
        addObject(rifle,88,293);

        Treasure treasure = new Treasure();
        addObject(treasure,407,960);
        Treasure treasure2 = new Treasure();
        addObject(treasure2,556,958);
        Treasure treasure3 = new Treasure();
        addObject(treasure3,195,715);
        Treasure treasure4 = new Treasure();
        addObject(treasure4,344,779);
        Treasure treasure5 = new Treasure();
        addObject(treasure5,245,966);
        Treasure treasure6 = new Treasure();
        addObject(treasure6,49,825);
        Treasure treasure7 = new Treasure();
        addObject(treasure7,48,660);
        Treasure treasure8 = new Treasure();
        addObject(treasure8,54,465);
        Treasure treasure9 = new Treasure();
        addObject(treasure9,291,266);
        Treasure treasure10 = new Treasure();
        addObject(treasure10,207,325);
        Treasure treasure11 = new Treasure();
        addObject(treasure11,217,468);
        Treasure treasure12 = new Treasure();
        addObject(treasure12,381,463);
        Treasure treasure13 = new Treasure();
        addObject(treasure13,447,266);
        Treasure treasure14 = new Treasure();
        addObject(treasure14,533,265);
        Treasure treasure15 = new Treasure();
        addObject(treasure15,953,428);
        Treasure treasure16 = new Treasure();
        addObject(treasure16,952,538);
        Treasure treasure17 = new Treasure();
        addObject(treasure17,948,680);
        Treasure treasure18 = new Treasure();
        addObject(treasure18,766,688);
        Treasure treasure19 = new Treasure();
        addObject(treasure19,765,773);
        Treasure treasure20 = new Treasure();
        addObject(treasure20,766,915);
        Treasure treasure21 = new Treasure();
        addObject(treasure21,596,675);
        Treasure treasure22 = new Treasure();
        addObject(treasure22,449,677);
        Treasure treasure23 = new Treasure();
        addObject(treasure23,556,417);
        Treasure treasure24 = new Treasure();
        addObject(treasure24,676,417);
        Treasure treasure25 = new Treasure();
        addObject(treasure25,785,421);
        Treasure treasure26 = new Treasure();
        addObject(treasure26,929,60);
        Treasure treasure27 = new Treasure();
        addObject(treasure27,445,45);
        
        Bandit bandit3 = new Bandit();
        addObject(bandit3,220,734);
        Bandit bandit5 = new Bandit();
        addObject(bandit5,675,83);
        Bandit bandit6 = new Bandit();
        addObject(bandit6,943,762);

        Raider raider = new Raider();
        addObject(raider,250,560);
    }
}

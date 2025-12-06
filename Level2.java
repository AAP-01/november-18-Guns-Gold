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
    
    public void act()
    {
        if (Greenfoot.isKeyDown("escape"))
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
        Player player = new Player();
        addObject(player,100, 900);

        Heart1 heart1 =  new  Heart1(player);
        addObject(heart1, 190, 50);
        Heart2 heart2 =  new  Heart2(player);
        addObject(heart2, 120, 50);
        Heart3 heart3 =  new  Heart3(player);
        addObject(heart3, 50, 50);

        PistolIcon pistolIcon =  new  PistolIcon();
        addObject(pistolIcon, 75, 120);

        StoneWall stoneWall = new StoneWall();
        addObject(stoneWall,25,190);
        StoneWall stoneWall2 = new StoneWall();
        addObject(stoneWall2,75,190);
        StoneWall stoneWall3 = new StoneWall();
        addObject(stoneWall3,125,190);
        StoneWall stoneWall4 = new StoneWall();
        addObject(stoneWall4,175,190);
        StoneWall stoneWall5 = new StoneWall();
        addObject(stoneWall5,225,190);
        StoneWall stoneWall6 = new StoneWall();
        addObject(stoneWall6,275,190);
        StoneWall stoneWall7 = new StoneWall();
        addObject(stoneWall7,325,190);
        StoneWall stoneWall8 = new StoneWall();
        addObject(stoneWall8,375,190);

        StoneWallTop stoneWallTop = new StoneWallTop();
        addObject(stoneWallTop,375,140);
        StoneWallTop stoneWallTop2 = new StoneWallTop();
        addObject(stoneWallTop2,375,90);
        StoneWallTop stoneWallTop3 = new StoneWallTop();
        addObject(stoneWallTop3,375,40);
        StoneWallTop stoneWallTop4 = new StoneWallTop();
        addObject(stoneWallTop4,375,0);

        StoneWallTop stoneWallTop5 = new StoneWallTop();
        addObject(stoneWallTop5,375,990);
        StoneWallTop stoneWallTop6 = new StoneWallTop();
        addObject(stoneWallTop6,375,940);
        StoneWallTop stoneWallTop7 = new StoneWallTop();
        addObject(stoneWallTop7,375,890);
        StoneWallTop stoneWallTop8 = new StoneWallTop();
        addObject(stoneWallTop8,375,840);
        StoneWallTop stoneWallTop9 = new StoneWallTop();
        addObject(stoneWallTop9,375,790);
        StoneWallTop stoneWallTop10 = new StoneWallTop();
        addObject(stoneWallTop10,525,990);
        StoneWallTop stoneWallTop11 = new StoneWallTop();
        addObject(stoneWallTop11,525,940);
        StoneWallTop stoneWallTop12 = new StoneWallTop();
        addObject(stoneWallTop12,525,890);
        StoneWallTop stoneWallTop13 = new StoneWallTop();
        addObject(stoneWallTop13,525,840);
        StoneWallTop stoneWallTop14 = new StoneWallTop();
        addObject(stoneWallTop14,525,790);
        StoneWall stoneWall9 = new StoneWall();
        addObject(stoneWall9,575,790);
        StoneWall stoneWall10 = new StoneWall();
        addObject(stoneWall10,625,790);
        StoneWall stoneWall11 = new StoneWall();
        addObject(stoneWall11,675,790);
        StoneWallTop stoneWallTop15 = new StoneWallTop();
        addObject(stoneWallTop15,675,740);
        StoneWallTop stoneWallTop16 = new StoneWallTop();
        addObject(stoneWallTop16,675,690);
        StoneWallTop stoneWallTop17 = new StoneWallTop();
        addObject(stoneWallTop17,375,740);
        StoneWall stoneWall12 = new StoneWall();
        addObject(stoneWall12,425,540);
        StoneWall stoneWall13 = new StoneWall();
        addObject(stoneWall13,475,540);
        StoneWall stoneWall14 = new StoneWall();
        addObject(stoneWall14,525,540);
        StoneWall stoneWall17 = new StoneWall();
        addObject(stoneWall17,675,540);

        StoneWall stoneWall18 = new StoneWall();
        addObject(stoneWall18,725,540);
        StoneWall stoneWall19 = new StoneWall();
        addObject(stoneWall19,775,540);
        StoneWall stoneWall20 = new StoneWall();
        addObject(stoneWall20,825,540);
        StoneWall stoneWall21 = new StoneWall();
        addObject(stoneWall21,875,540);
        StoneWall stoneWall22 = new StoneWall();
        addObject(stoneWall22,925,540);
        StoneWall stoneWall23 = new StoneWall();
        addObject(stoneWall23,975,540);
        StoneWall stoneWall24 = new StoneWall();
        addObject(stoneWall24,725,690);
        StoneWall stoneWall25 = new StoneWall();
        addObject(stoneWall25,775,690);
        StoneWall stoneWall26 = new StoneWall();
        addObject(stoneWall26,875,890);
        StoneWall stoneWall27 = new StoneWall();
        addObject(stoneWall27,925,890);
        StoneWall stoneWall28 = new StoneWall();
        addObject(stoneWall28,975,890);
        StoneWall stoneWall29 = new StoneWall();
        addObject(stoneWall29,825,890);

        StoneWall stoneWall30 = new StoneWall();
        addObject(stoneWall30,825,690);
        StoneWallTop stoneWallTop22 = new StoneWallTop();
        addObject(stoneWallTop22,875,690);
        StoneWallTop stoneWallTop23 = new StoneWallTop();
        addObject(stoneWallTop23,875,740);
        StoneWallTop stoneWallTop24 = new StoneWallTop();
        addObject(stoneWallTop24,525,490);
        StoneWallTop stoneWallTop25 = new StoneWallTop();
        addObject(stoneWallTop25,525,440);
        StoneWallTop stoneWallTop26 = new StoneWallTop();
        addObject(stoneWallTop26,525,390);
        StoneWallTop stoneWallTop27 = new StoneWallTop();
        addObject(stoneWallTop27,525,340);
        StoneWallTop stoneWallTop28 = new StoneWallTop();
        addObject(stoneWallTop28,525,290);
        StoneWallTop stoneWallTop29 = new StoneWallTop();
        addObject(stoneWallTop29,525,240);
        StoneWallTop stoneWallTop30 = new StoneWallTop();
        addObject(stoneWallTop30,525,190);
        StoneWall stoneWallpoop = new StoneWall();
        addObject(stoneWallpoop,475,190);
        StoneWall stoneWallpee = new StoneWall();
        addObject(stoneWallpee,425,190);
        StoneWallTop stoneWallTop31 = new StoneWallTop();
        addObject(stoneWallTop31,725,490);
        StoneWallTop stoneWallTop32 = new StoneWallTop();
        addObject(stoneWallTop32,725,440);
        StoneWallTop stoneWallTop33 = new StoneWallTop();
        addObject(stoneWallTop33,725,390);
        StoneWall stoneWall31 = new StoneWall();
        addObject(stoneWall31,775,390);
        StoneWall stoneWall32 = new StoneWall();
        addObject(stoneWall32,825,390);
        StoneWallTop stoneWallTop34 = new StoneWallTop();
        addObject(stoneWallTop34,725,340);
        StoneWall stoneWall33 = new StoneWall();
        addObject(stoneWall33,675,340);
        StoneWallTop stoneWallTop35 = new StoneWallTop();
        addObject(stoneWallTop35,675,290);
        StoneWallTop stoneWallTop36 = new StoneWallTop();
        addObject(stoneWallTop36,675,240);
        StoneWallTop stoneWallTop37 = new StoneWallTop();
        addObject(stoneWallTop37,675,190);
        StoneWallTop stoneWallTop38 = new StoneWallTop();
        addObject(stoneWallTop38,675,40);
        StoneWallTop stoneWallTop39 = new StoneWallTop();
        addObject(stoneWallTop39,675,0);
        StoneWall stoneWall34 = new StoneWall();
        addObject(stoneWall34,725,190);
        StoneWall stoneWall35 = new StoneWall();
        addObject(stoneWall35,775,190);
        StoneWall stoneWall36 = new StoneWall();
        addObject(stoneWall36,825,190);
        StoneWallTop stoneWallTop40 = new StoneWallTop();
        addObject(stoneWallTop40,975,340);
        StoneWallTop stoneWallTop41 = new StoneWallTop();
        addObject(stoneWallTop41,975,290);
        StoneWallTop stoneWallTop42 = new StoneWallTop();
        addObject(stoneWallTop42,825,140);
        StoneWall stoneWall37 = new StoneWall();
        addObject(stoneWall37,875,140);

        StoneWall stoneWall38 = new StoneWall();
        addObject(stoneWall38,375,540);
        StoneWall stoneWall39 = new StoneWall();
        addObject(stoneWall39,325,540);
        StoneWall stoneWall40 = new StoneWall();
        addObject(stoneWall40,275,540);
        StoneWall stoneWall41 = new StoneWall();
        addObject(stoneWall41,125,540);
        StoneWall stoneWall42 = new StoneWall();
        addObject(stoneWall42,75,540);
        StoneWall stoneWall43 = new StoneWall();
        addObject(stoneWall43,25,540);
        StoneWallTop stoneWallTop00 = new StoneWallTop();
        addObject(stoneWallTop00,225,740);
        StoneWallTop stoneWallTop09 = new StoneWallTop();
        addObject(stoneWallTop09,225,790);
        StoneWallTop stoneWallTop08 = new StoneWallTop();
        addObject(stoneWallTop08,225,840);
        StoneWallTop stoneWallTop07 = new StoneWallTop();
        addObject(stoneWallTop07,225,890);
        StoneWall stoneWall44 = new StoneWall();
        addObject(stoneWall44,175,790);
        StoneWall stoneWall45 = new StoneWall();
        addObject(stoneWall45,125,790);
        StoneWall stoneWall46 = new StoneWall();
        addObject(stoneWall46,75,790);
        StoneWall stoneWall47 = new StoneWall();
        addObject(stoneWall47,25,790);
        StoneWallTop stoneWallTop43 = new StoneWallTop();
        addObject(stoneWallTop43,125,490);
        StoneWallTop stoneWallTop44 = new StoneWallTop();
        addObject(stoneWallTop44,125,440);
        StoneWallTop stoneWallTop45 = new StoneWallTop();
        addObject(stoneWallTop45,125,390);
        StoneWallTop stoneWallTop46 = new StoneWallTop();
        addObject(stoneWallTop46,125,340);
        StoneWall stoneWall49 = new StoneWall();
        addObject(stoneWall49,175,390);
        StoneWall stoneWall50 = new StoneWall();
        addObject(stoneWall50,225,390);
        StoneWall stoneWall51 = new StoneWall();
        addObject(stoneWall51,275,390);
        StoneWall stoneWall52 = new StoneWall();
        addObject(stoneWall52,325,390);
        StoneWall stoneWall53 = new StoneWall();
        addObject(stoneWall53,375,390);
        StoneWallTop stoneWallTop47 = new StoneWallTop();
        addObject(stoneWallTop47,375,340);

        Juggernaut juggernaut = new Juggernaut();
        addObject(juggernaut,59,633);

        Raider raider = new Raider();
        addObject(raider,48,461);
        Raider raider2 = new Raider();
        addObject(raider2,808,463);

        Bandit bandit = new Bandit();
        addObject(bandit,618,938);
        Bandit bandit2 = new Bandit();
        addObject(bandit2,796,286);

        Raider raider3 = new Raider();
        addObject(raider3,471,80);

        Invincibility invincibility = new Invincibility();
        addObject(invincibility,447,957);

        InstantKill instantKill = new InstantKill();
        addObject(instantKill,941,56);

        Shotgun shotgun = new Shotgun();
        addObject(shotgun,254,333);

        Treasure treasure = new Treasure();
        addObject(treasure,50,382);
        Treasure treasure2 = new Treasure();
        addObject(treasure2,52,264);
        Treasure treasure3 = new Treasure();
        addObject(treasure3,205,260);
        Treasure treasure4 = new Treasure();
        addObject(treasure4,354,262);
        Treasure treasure5 = new Treasure();
        addObject(treasure5,454,327);
        Treasure treasure6 = new Treasure();
        addObject(treasure6,441,468);
        Treasure treasure7 = new Treasure();
        addObject(treasure7,203,466);
        Treasure treasure8 = new Treasure();
        addObject(treasure8,936,618);
        Treasure treasure9 = new Treasure();
        addObject(treasure9,772,614);
        Treasure treasure10 = new Treasure();
        addObject(treasure10,597,615);
        Treasure treasure11 = new Treasure();
        addObject(treasure11,397,615);
        Treasure treasure12 = new Treasure();
        addObject(treasure12,205,621);
        Treasure treasure13 = new Treasure();
        addObject(treasure13,448,860);
        Treasure treasure14 = new Treasure();
        addObject(treasure14,933,960);
        Treasure treasure15 = new Treasure();
        addObject(treasure15,781,766);
        Treasure treasure16 = new Treasure();
        addObject(treasure16,907,477);
        Treasure treasure17 = new Treasure();
        addObject(treasure17,904,366);
        Treasure treasure18 = new Treasure();
        addObject(treasure18,899,229);
        Treasure treasure19 = new Treasure();
        addObject(treasure19,731,111);
        Treasure treasure20 = new Treasure();
        addObject(treasure20,598,439);
        Treasure treasure21 = new Treasure();
        addObject(treasure21,597,264);
        Treasure treasure22 = new Treasure();
        addObject(treasure22,592,117);
    }
}
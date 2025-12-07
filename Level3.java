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
        whichLevel = "Level3";
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new MainScreen()); 
        }
    }
    
    private void prepare()
    {
        Player player =  new  Player();
        addObject(player, 45,720);

        Heart1 heart1 =  new  Heart1(player);
        addObject(heart1, 190, 50);
        Heart2 heart2 =  new  Heart2(player);
        addObject(heart2, 120, 50);
        Heart3 heart3 =  new  Heart3(player);
        addObject(heart3, 50, 50);

        PistolIcon pistolIcon =  new  PistolIcon();
        addObject(pistolIcon, 75, 120);

        ConcreteWall concreteWall = new ConcreteWall();
        addObject(concreteWall,25,190);
        ConcreteWall concreteWall2 = new ConcreteWall();
        addObject(concreteWall2,75,190);
        ConcreteWall concreteWall3 = new ConcreteWall();
        addObject(concreteWall3,125,190);
        ConcreteWall concreteWall4 = new ConcreteWall();
        addObject(concreteWall4,175,190);
        ConcreteWall concreteWall5 = new ConcreteWall();
        addObject(concreteWall5,225,190);
        ConcreteWall concreteWall6 = new ConcreteWall();
        addObject(concreteWall6,275,190);
        ConcreteWall concreteWall7 = new ConcreteWall();
        addObject(concreteWall7,325,190);
        ConcreteWall concreteWall8 = new ConcreteWall();
        addObject(concreteWall8,375,190);
        ConcreteWall concreteWall9 = new ConcreteWall();
        addObject(concreteWall9,375,140);
        ConcreteWall concreteWall10 = new ConcreteWall();
        addObject(concreteWall10,375,90);
        ConcreteWall concreteWall11 = new ConcreteWall();
        addObject(concreteWall11,375,40);
        ConcreteWall concreteWall12 = new ConcreteWall();
        addObject(concreteWall12,375,0);

        ConcreteWall concreteWall13 = new ConcreteWall();
        addObject(concreteWall13,525,190);
        ConcreteWall concreteWall14 = new ConcreteWall();
        addObject(concreteWall14,575,190);
        ConcreteWall concreteWall15 = new ConcreteWall();
        addObject(concreteWall15,625,190);
        ConcreteWall concreteWall16 = new ConcreteWall();
        addObject(concreteWall16,675,190);
        ConcreteWall concreteWall17 = new ConcreteWall();
        addObject(concreteWall17,725,190);
        ConcreteWall concreteWall18 = new ConcreteWall();
        addObject(concreteWall18,775,190);
        ConcreteWall concreteWall19 = new ConcreteWall();
        addObject(concreteWall19,775,240);
        ConcreteWall concreteWall20 = new ConcreteWall();
        addObject(concreteWall20,775,290);
        ConcreteWall concreteWall21 = new ConcreteWall();
        addObject(concreteWall21,825,290);
        ConcreteWall concreteWall22 = new ConcreteWall();
        addObject(concreteWall22,875,290);
        ConcreteWall concreteWall23 = new ConcreteWall();
        addObject(concreteWall23,925,290);
        ConcreteWall concreteWall24 = new ConcreteWall();
        addObject(concreteWall24,975,290);
        ConcreteWall concreteWall25 = new ConcreteWall();
        addObject(concreteWall25,775,140);
        ConcreteWall concreteWall26 = new ConcreteWall();
        addObject(concreteWall26,775,90);
        Crate crate = new Crate();
        addObject(crate,725,140);
        Crate crate2 = new Crate();
        addObject(crate2,675,140);
        Crate crate3 = new Crate();
        addObject(crate3,625,140);
        Crate crate4 = new Crate();
        addObject(crate4,575,140);
        Crate crate5 = new Crate();
        addObject(crate5,525,140);

        Crate crate6 = new Crate();
        addObject(crate6,775,340);
        Crate crate7 = new Crate();
        addObject(crate7,825,340);
        Crate crate8 = new Crate();
        addObject(crate8,875,340);
        Crate crate9 = new Crate();
        addObject(crate9,925,340);
        Crate crate10 = new Crate();
        addObject(crate10,975,340);
        ConcreteWall concreteWall27 = new ConcreteWall();
        addObject(concreteWall27,775,490);
        ConcreteWall concreteWall28 = new ConcreteWall();
        addObject(concreteWall28,775,540);
        ConcreteWall concreteWall29 = new ConcreteWall();
        addObject(concreteWall29,775,590);
        ConcreteWall concreteWall30 = new ConcreteWall();
        addObject(concreteWall30,775,640);
        ConcreteWall concreteWall31 = new ConcreteWall();
        addObject(concreteWall31,775,690);
        ConcreteWall concreteWall32 = new ConcreteWall();
        addObject(concreteWall32,775,790);
        ConcreteWall concreteWall33 = new ConcreteWall();
        addObject(concreteWall33,775,740);
        ConcreteWall concreteWall34 = new ConcreteWall();
        addObject(concreteWall34,775,840);
        Crate crate11 = new Crate();
        addObject(crate11,825,490);
        Crate crate12 = new Crate();
        addObject(crate12,825,540);
        Crate crate13 = new Crate();
        addObject(crate13,825,590);
        Crate crate14 = new Crate();
        addObject(crate14,825,640);
        Crate crate15 = new Crate();
        addObject(crate15,825,690);
        Crate crate16 = new Crate();
        addObject(crate16,825,740);
        Crate crate17 = new Crate();
        addObject(crate17,825,790);
        Crate crate18 = new Crate();
        addObject(crate18,825,840);
        Crate crate19 = new Crate();
        addObject(crate19,725,490);
        Crate crate20 = new Crate();
        addObject(crate20,725,540);
        Crate crate21 = new Crate();
        addObject(crate21,725,590);
        Crate crate22 = new Crate();
        addObject(crate22,725,640);
        Crate crate23 = new Crate();
        addObject(crate23,725,690);
        Crate crate24 = new Crate();
        addObject(crate24,725,740);
        Crate crate25 = new Crate();
        addObject(crate25,725,790);
        Crate crate26 = new Crate();
        addObject(crate26,725,840);

        Crate crate27 = new Crate();
        addObject(crate27,325,240);
        Crate crate28 = new Crate();
        addObject(crate28,275,240);
        Crate crate29 = new Crate();
        addObject(crate29,225,240);
        Crate crate30 = new Crate();
        addObject(crate30,175,240);
        Crate crate31 = new Crate();
        addObject(crate31,125,240);
        Crate crate32 = new Crate();
        addObject(crate32,25,590);
        Crate crate33 = new Crate();
        addObject(crate33,25,290);
        Crate crate34 = new Crate();
        addObject(crate34,25,340);
        Crate crate35 = new Crate();
        addObject(crate35,25,390);
        Crate crate36 = new Crate();
        addObject(crate36,25,440);
        Crate crate37 = new Crate();
        addObject(crate37,25,490);
        Crate crate38 = new Crate();
        addObject(crate38,175,390);
        Crate crate39 = new Crate();
        addObject(crate39,225,390);
        Crate crate40 = new Crate();
        addObject(crate40,275,390);
        Crate crate41 = new Crate();
        addObject(crate41,325,390);
        Crate crate42 = new Crate();
        addObject(crate42,175,440);
        Crate crate43 = new Crate();
        addObject(crate43,225,440);
        Crate crate44 = new Crate();
        addObject(crate44,275,440);
        Crate crate45 = new Crate();
        addObject(crate45,325,440);
        Crate crate46 = new Crate();
        addObject(crate46,375,390);
        Crate crate47 = new Crate();
        addObject(crate47,375,440);
        Crate crate48 = new Crate();
        addObject(crate48,25,540);
        Crate crate49 = new Crate();
        addObject(crate49,425,390);
        Crate crate50 = new Crate();
        addObject(crate50,425,440);
        Crate crate51 = new Crate();
        addObject(crate51,175,590);
        Crate crate52 = new Crate();
        addObject(crate52,125,590);
        Crate crate53 = new Crate();
        addObject(crate53,225,590);
        Crate crate54 = new Crate();
        addObject(crate54,275,590);
        Crate crate55 = new Crate();
        addObject(crate55,325,590);
        ConcreteWall concreteWall35 = new ConcreteWall();
        addObject(concreteWall35,125,640);
        ConcreteWall concreteWall36 = new ConcreteWall();
        addObject(concreteWall36,75,640);
        ConcreteWall concreteWall37 = new ConcreteWall();
        addObject(concreteWall37,25,640);
        ConcreteWall concreteWall38 = new ConcreteWall();
        addObject(concreteWall38,175,640);
        ConcreteWall concreteWall39 = new ConcreteWall();
        addObject(concreteWall39,225,640);
        ConcreteWall concreteWall40 = new ConcreteWall();
        addObject(concreteWall40,275,640);
        ConcreteWall concreteWall41 = new ConcreteWall();
        addObject(concreteWall41,325,640);
        ConcreteWall concreteWall42 = new ConcreteWall();
        addObject(concreteWall42,375,640);
        Crate crate56 = new Crate();
        addObject(crate56,25,240);
        Crate crate57 = new Crate();
        addObject(crate57,75,240);
        Crate crate58 = new Crate();
        addObject(crate58,75,590);

        ConcreteWall concreteWall43 = new ConcreteWall();
        addObject(concreteWall43,25,790);
        ConcreteWall concreteWall44 = new ConcreteWall();
        addObject(concreteWall44,75,790);
        ConcreteWall concreteWall45 = new ConcreteWall();
        addObject(concreteWall45,125,790);
        ConcreteWall concreteWall46 = new ConcreteWall();
        addObject(concreteWall46,175,790);
        ConcreteWall concreteWall47 = new ConcreteWall();
        addObject(concreteWall47,325,790);
        ConcreteWall concreteWall48 = new ConcreteWall();
        addObject(concreteWall48,375,790);
        Crate crate59 = new Crate();
        addObject(crate59,25,840);
        Crate crate60 = new Crate();
        addObject(crate60,25,890);
        Crate crate61 = new Crate();
        addObject(crate61,25,940);
        Crate crate62 = new Crate();
        addObject(crate62,25,990);
        ConcreteWall concreteWall49 = new ConcreteWall();
        addObject(concreteWall49,375,840);
        ConcreteWall concreteWall50 = new ConcreteWall();
        addObject(concreteWall50,575,240);
        ConcreteWall concreteWall51 = new ConcreteWall();
        addObject(concreteWall51,425,790);
        ConcreteWall concreteWall52 = new ConcreteWall();
        addObject(concreteWall52,425,640);
        ConcreteWall concreteWall53 = new ConcreteWall();
        addObject(concreteWall53,375,990);
        Crate crate63 = new Crate();
        addObject(crate63,575,640);
        Crate crate64 = new Crate();
        addObject(crate64,575,690);
        Crate crate65 = new Crate();
        addObject(crate65,775,990);
        Crate crate66 = new Crate();
        addObject(crate66,825,990);
        Crate crate67 = new Crate();
        addObject(crate67,875,990);
        Crate crate68 = new Crate();
        addObject(crate68,925,990);
        Crate crate69 = new Crate();
        addObject(crate69,975,990);
        Crate crate70 = new Crate();
        addObject(crate70,725,990);
        Crate crate71 = new Crate();
        addObject(crate71,675,990);
        Crate crate72 = new Crate();
        addObject(crate72,625,990);
        Crate crate73 = new Crate();
        addObject(crate73,575,990);
        Crate crate74 = new Crate();
        addObject(crate74,525,990);
        Crate crate75 = new Crate();
        addObject(crate75,475,990);
        Crate crate76 = new Crate();
        addObject(crate76,575,390);
        Crate crate77 = new Crate();
        addObject(crate77,575,440);
        Crate crate78 = new Crate();
        addObject(crate78,75,990);
        Crate crate79 = new Crate();
        addObject(crate79,125,990);

        Juggernaut juggernaut = new Juggernaut();
        addObject(juggernaut,926,909);
        Juggernaut juggernaut2 = new Juggernaut();
        addObject(juggernaut2,456,65);
        Juggernaut juggernaut3 = new Juggernaut();
        addObject(juggernaut3,103,512);

        Raider raider = new Raider();
        addObject(raider,642,264);
        Raider raider2 = new Raider();
        addObject(raider2,108,320);
        Raider raider3 = new Raider();
        addObject(raider3,648,666);
        Bandit bandit = new Bandit();
        addObject(bandit,99,892);
        removeObject(bandit);
        Raider raider4 = new Raider();
        addObject(raider4,948,212);
        Raider raider5 = new Raider();
        addObject(raider5,925,422);

        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,837,135);
        Invincibility invincibility = new Invincibility();
        addObject(invincibility,99,413);
        InstantKill instantKill = new InstantKill();
        addObject(instantKill,99,897);

        Rifle rifle = new Rifle();
        addObject(rifle,578,544);
        Shotgun shotgun = new Shotgun();
        addObject(shotgun,630,56);

        Treasure treasure = new Treasure();
        addObject(treasure,368,913);
        Treasure treasure2 = new Treasure();
        addObject(treasure2,245,722);
        Treasure treasure3 = new Treasure();
        addObject(treasure3,361,720);
        Treasure treasure4 = new Treasure();
        addObject(treasure4,495,719);
        Treasure treasure5 = new Treasure();
        addObject(treasure5,498,615);
        Treasure treasure6 = new Treasure();
        addObject(treasure6,499,508);
        Treasure treasure7 = new Treasure();
        addObject(treasure7,508,385);
        Treasure treasure8 = new Treasure();
        addObject(treasure8,446,289);
        Treasure treasure9 = new Treasure();
        addObject(treasure9,306,311);
        Treasure treasure10 = new Treasure();
        addObject(treasure10,180,313);
        Treasure treasure11 = new Treasure();
        addObject(treasure11,185,520);
        Treasure treasure12 = new Treasure();
        addObject(treasure12,327,518);
        Treasure treasure13 = new Treasure();
        addObject(treasure13,448,166);
        Treasure treasure14 = new Treasure();
        addObject(treasure14,772,32);
        Treasure treasure15 = new Treasure();
        addObject(treasure15,953,43);
        Treasure treasure16 = new Treasure();
        addObject(treasure16,949,134);
        Treasure treasure17 = new Treasure();
        addObject(treasure17,922,816);
        Treasure treasure18 = new Treasure();
        addObject(treasure18,923,726);
        Treasure treasure19 = new Treasure();
        addObject(treasure19,921,616);
        Treasure treasure20 = new Treasure();
        addObject(treasure20,918,507);
        Treasure treasure21 = new Treasure();
        addObject(treasure21,813,413);
        Treasure treasure22 = new Treasure();
        addObject(treasure22,661,412);
        Treasure treasure23 = new Treasure();
        addObject(treasure23,810,916);
        Treasure treasure24 = new Treasure();
        addObject(treasure24,635,915);
        Treasure treasure25 = new Treasure();
        addObject(treasure25,494,912);
        Treasure treasure26 = new Treasure();
        addObject(treasure26,643,799);
    }
}

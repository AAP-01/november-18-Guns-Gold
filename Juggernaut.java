import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Juggernaut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juggernaut extends Enemy
{
    private int speed = 1;
    private int enemyDirection = 0;
    private int movementCooldown;
    
    private String Direction;
    private double heavyRifleBulletDamage = 3.0;
    
    private boolean randomShooting;
    
    /**
     * 
     */
    public Juggernaut()
    {
        GreenfootImage imageEnemy = getImage();
        imageEnemy.scale(75, 75);
        health = 20.0;
    }

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        shoot();
        loseCondition();
    }
    
    public void move()
    {
        boolean blocked = false;
        int worldWidth = getWorld().getWidth();
        int worldHeight = getWorld().getHeight();

        switch(enemyDirection)
        {
            case 0: //up
                if (getY() - speed <= 0 || getOneObjectAtOffset(0, -speed, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX(), getY() - speed);
                }
                break;
            case 1: //down
                if (getY() + speed >= worldHeight - 1 || getOneObjectAtOffset(0, speed, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX(), getY() + speed);
                }
                break;
            case 2: //left
                if (getX() - speed <= 0 || getOneObjectAtOffset(-speed, 0, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX() - speed, getY());
                }
                break;
            case 3: //right
                if (getX() + speed >= worldWidth - 1 || getOneObjectAtOffset(speed, 0, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX() + speed, getY());
                }
                break;
        }

        if (blocked) {
            enemyDirection = Greenfoot.getRandomNumber(4);
        }
    }
    
    public void shoot()
    {
        if(Greenfoot.getRandomNumber(101) < 1)
        {
            HeavyRifleBullet heavyRifleBullet =  new  HeavyRifleBullet(enemyDirection);
            getWorld().addObject(heavyRifleBullet, getX(), getY());
            Greenfoot.playSound("heavy rifle gunshot.mp3");
        }
    }

    public void loseCondition()
    {
        if (getWorld().getObjects(Player.class).isEmpty()) {
            World defeatScreen =  new  EndScreen();
            Greenfoot.setWorld(defeatScreen);
            Greenfoot.playSound("lose.mp3");
        }
    }
}

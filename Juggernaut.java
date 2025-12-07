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
    
    private int bulletCounter = 0;
    private int shootLimit = 1;
    private double lastTimeFired = 0;
    
    /**
     * 
     */
    public Juggernaut()
    {
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
                if (getY() - speed <= 38 || getOneObjectAtOffset(0, -38, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX(), getY() - speed);
                }
                break;
            case 1: //down
                if (getY() + speed >= worldHeight - 38 || getOneObjectAtOffset(0, 38, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX(), getY() + speed);
                }
                break;
            case 2: //left
                if (getX() - speed <= 38 || getOneObjectAtOffset(-38, 0, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX() - speed, getY());
                    setImage("Juggernaut Flipped.png");
                }
                break;
            case 3: //right
                if (getX() + speed >= worldWidth - 38 || getOneObjectAtOffset(38, 0, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX() + speed, getY());
                    setImage("Juggernaut.png");
                }
                break;
        }

        if (blocked) {
            enemyDirection = Greenfoot.getRandomNumber(4);
        }
    }
    
    public void shoot()
    {
        double now = System.currentTimeMillis();
        
        if(bulletCounter < shootLimit)
        {
            HeavyRifleBullet heavyRifleBullet =  new  HeavyRifleBullet(enemyDirection);
            getWorld().addObject(heavyRifleBullet, getX(), getY());
            
            GreenfootSound sound = new
            GreenfootSound("heavy rifle gunshot(edited, trimmed, decrease volume).wav");
            sound.setVolume(75);
            sound.play();
            
            bulletCounter++;
            lastTimeFired = now;
        }
        
        if(bulletCounter == 1 && now - lastTimeFired >= 5000)
        {
            bulletCounter = 0;
        }
    }
}

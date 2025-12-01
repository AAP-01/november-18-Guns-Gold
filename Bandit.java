import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bandit extends Enemy
{
    private int speed = 2;
    private int enemyDirection = 0;
    private int movementCooldown;
    
    /**
     * 
     */
    public Bandit()
    {
        GreenfootImage imageEnemy = getImage();
        imageEnemy.scale(75, 75);
        health = 6.0;
    }

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        killPlayer();
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

    /**
     * 
     */
    public void killPlayer()
    {
        Actor player = getOneIntersectingObject(Player.class);
        
        if(player != null)
        {
            if(!((Player)player).getInvincibility())
            {
                World world = getWorld();
                world.removeObject(player);
                return;
            }
        }
    }
    
    public void loseCondition()
    {
        if (getWorld().getObjects(Player.class).isEmpty()) {
            World endScreen =  new  EndScreen();
            Greenfoot.setWorld(endScreen);
            Greenfoot.playSound("lose.mp3");
        }
    }
}

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
                    setImage("Bandit Flipped.png");
                }
                break;
            case 3: //right
                if (getX() + speed >= worldWidth - 38 || getOneObjectAtOffset(38, 0, Barrier.class) != null) {
                    blocked = true;
                } else {
                    setLocation(getX() + speed, getY());
                    setImage("Bandit.png");
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
    
    
}

 import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class HeavyRifleBullet extends Actor
{
    private int enemyDirection = 0;
    private double heavyRifleBulletDamage = 3.0;

    /**
     * 
     */
    public HeavyRifleBullet(int enemyDirection)
    {
        this.enemyDirection = enemyDirection;
    }

    /**
     * 
     */
    public void act()
    {
        if (getWorld() == null) return;
        moveInDirection();
        
        if (getWorld() == null) return;
        despawning();
        
        if (getWorld() == null) return;
        hurtPlayer();
    }
    
    /**
     * 
     */
    private void moveInDirection()
    {
        int speed = 20;
        switch (enemyDirection) {
            case 0:
                setLocation(getX(), getY() - speed);
                setRotation(-90);
                break;
            case 1:
                setLocation(getX(), getY() + speed);
                setRotation(90);
                break;
            case 2:
                setLocation(getX() - speed, getY());
                setRotation(180);
                break;
            case 3:
                setLocation(getX() + speed, getY());
                setRotation(0);
                break;
        }
    }

    public void despawning()
    {
        if (isAtEdge()) {
            getWorld().removeObject(this);
            return;
        }        
        
        Actor barrier = getOneIntersectingObject(Barrier.class);
        if(barrier != null)
        {
            World world = getWorld();
            getWorld().removeObject(this);
            return;            
        }
    }
    
    /**
     * 
     */
    public void hurtPlayer()
    {
        Actor player = getOneIntersectingObject(Player.class);
        
        if(player != null)
        {
            if(!((Player)player).getInvincibility())
            {
                Player p = (Player) player;
                p.takeDamage(heavyRifleBulletDamage);
                
                getWorld().removeObject(this);
                return;
            }
        }
    }
}

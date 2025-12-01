import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RifleBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RifleBullet extends Actor
{
    private String Direction;
    private double rifleBulletDamage = 1.5;

    /**
     * 
     */
    public RifleBullet(String Direction)
    {
       this.Direction = Direction;
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
        hurtEnemy();
    }
    
    /**
     * 
     */
    private void moveInDirection()
    {
        int speed = 20;
        switch (Direction) {
            case "up":
                setLocation(getX(), getY() - speed);
                setRotation(-90);
                break;
            case "down":
                setLocation(getX(), getY() + speed);
                setRotation(90);
                break;
            case "left":
                setLocation(getX() - speed, getY());
                setRotation(180);
                break;
            case "right":
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
    public void hurtEnemy()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        Player player = (Player) getWorld().getObjects(Player.class).get(0);
        
        if(enemy != null)
        {
            Enemy e = (Enemy) enemy;
            if("Instant Kill".equals(player.getBoost()))
            {
                rifleBulletDamage = e.getHealth();
            }
            e.takeDamage(rifleBulletDamage);
            getWorld().removeObject(this);
            return;
        }
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player extends Actor
{
    private int speed;
    
    private String Direction = "up";
    
    private boolean spacePressedLastFrame = false;
    private String gunType = "Pistol";
    private int shotgunAmmo = 8;
    
    private int rifleAmmo = 21;
    private int bulletCounter = 0;
    private int burstLimit = 3;
    private double lastTimeFired = 0;
    
    protected double playerHealth;
    private boolean invincibility;
    private double obtainedBoost = 0;
    private String boostType = "None";

    /**
     * 
     */
    public Player()
    {
        GreenfootImage imagePlayer = getImage();
        imagePlayer.scale(75, 75);
        playerHealth = 6.0;
        speed = 3;
        invincibility = false;
    }

    /**
     * Act - do whatever the player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        semiAutoShooting();
        automaticShooting();
        collectTreasure();
        winCondition();
        boost();
    }

    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed);
            if (isTouching(Barrier.class)) {
                setLocation(getX(), getY() + speed);
            }
            Direction = "up";
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed);
            if (isTouching(Barrier.class)) {
                setLocation(getX(), getY() - speed);
            }
            Direction = "down";
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY());
            if (isTouching(Barrier.class)) {
                setLocation(getX() + speed, getY());
            }
            Direction = "left";
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY());
            if (isTouching(Barrier.class)) {
                setLocation(getX() - speed, getY());
            }
            Direction = "right";
        }
    }

    /**
     * 
     */
    private void semiAutoShooting()
    {
        boolean spacePressed = Greenfoot.isKeyDown("space");
        if (spacePressed &&  ! spacePressedLastFrame) {
            switch (gunType)
            {
                case "Pistol":
                    shootPistol();
                    break;
                case "Shotgun":
                    shootShotgun();
                    break;
            }
        }
        spacePressedLastFrame = spacePressed;
    }
    
    private void automaticShooting()
    {
        if(gunType == "Rifle")
        {
            shootRifle();
        }
    }
    
    public void shootPistol()
    {
        double now = System.currentTimeMillis();
        
        if(now - lastTimeFired >= 200)
        {
            PistolBullet bullet =  new  PistolBullet(Direction);
            getWorld().addObject(bullet, getX(), getY());
            Greenfoot.playSound("pistol gunshot (edited, cropped).wav");
            lastTimeFired = now;
        }
    }
    
    public void shootShotgun()
    {
        double now = System.currentTimeMillis();
        
        if(shotgunAmmo > 0 && now - lastTimeFired >= 1000)
        {
            switch (Direction)
            {
                case "up":
                case "down":
                    getWorld().addObject(new  ShotgunPellets(Direction), getX() - 20, getY());
                    getWorld().addObject(new  ShotgunPellets(Direction), getX(), getY());
                    getWorld().addObject(new  ShotgunPellets(Direction), getX() + 20, getY());
                    break;
                case "left":
                case "right":
                    getWorld().addObject(new  ShotgunPellets(Direction), getX(), getY() - 20);
                    getWorld().addObject(new  ShotgunPellets(Direction), getX(), getY());
                    getWorld().addObject(new  ShotgunPellets(Direction), getX(), getY() + 20);
                    break;
            }
            shotgunAmmo--;
            lastTimeFired = now;
            Greenfoot.playSound("shotgun blast.mp3");
        }
        
        if(shotgunAmmo == 0)
        {
            setGunType("Pistol");
            Greenfoot.playSound("pistol equipped.mp3");
            PistolIcon pistolIcon =  new PistolIcon();
            getWorld().addObject(pistolIcon, 75, 120);
            
            ShotgunIcon shotgunIcon =  (ShotgunIcon) getWorld().getObjects(ShotgunIcon.class).get(0);
            getWorld().removeObject(shotgunIcon);
        }
    }
    
    public void shootRifle()
    {
        boolean spacePressed = Greenfoot.isKeyDown("space");
        double now = System.currentTimeMillis();
        
        if(spacePressed && bulletCounter < burstLimit && now - lastTimeFired >= 50)
        {
            RifleBullet bullet =  new  RifleBullet(Direction);
            getWorld().addObject(bullet, getX(), getY());
            Greenfoot.playSound("rifle gunshot (edited, trimmed).wav");
            bulletCounter++;
            rifleAmmo--;
            lastTimeFired = now;
        }
        
        if(!spacePressed)
        {
            bulletCounter = 0;
        }
        
        if(rifleAmmo == 0)
        {
            setGunType("Pistol");
            Greenfoot.playSound("pistol equipped.mp3");
            PistolIcon pistolIcon =  new PistolIcon();
            getWorld().addObject(pistolIcon, 75, 120);
            
            RifleIcon rifleIcon =  (RifleIcon) getWorld().getObjects(RifleIcon.class).get(0);
            getWorld().removeObject(rifleIcon);
        }
    }
    
    public void setGunType(String newGunType)
    {
        gunType = newGunType;
    }
    
    public String getGunType()
    {
        return gunType;
    }

    public void takeDamage(double amount) {
        playerHealth = playerHealth - amount;
        if (playerHealth <= 0) {
            getWorld().removeObject(this);
            Greenfoot.playSound("roblox-death-sound-effect.mp3");
        }
    }
    
    public void boost()
    {
        if(boostType == null) return;
        double now = System.currentTimeMillis();
        switch (boostType)
        {
            case "Speed Boost":
                if (now - obtainedBoost <= 10000)
                {
                    setPlayerSpeed(5); 
                }
                else
                {
                    setPlayerSpeed(3);
                    boostType = null;
                }
                break;
            case "Instant Kill":
                if (now - obtainedBoost <= 10000)
                {
                    //boost modifications are in the projectile classes
                }
                else
                {
                    boostType = null;
                }
                break;
            case "Invincibility":
                if (now - obtainedBoost <= 5000)
                {
                    invincibility = true;
                }
                else
                {
                    invincibility = false;
                    boostType = null;
                }
                break;
        }
    }
    
    public boolean getInvincibility()
    {
        return invincibility;
    }

    public void setBoost(String newBoost)
    {
        boostType = newBoost;
        obtainedBoost = System.currentTimeMillis();;
    }
    
    public String getBoost()
    {
        return boostType;
    }
    
    public void setPlayerSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public void collectTreasure()
    {
        Actor treasure = getOneIntersectingObject(Treasure.class);
        if(treasure != null)
        {
            World world = getWorld();
            world.removeObject(treasure);
        }
    }
    
    public void winCondition()
    {
        if (getWorld().getObjects(Treasure.class).isEmpty() || getWorld().getObjects(Enemy.class).isEmpty()) {
            World endScreen =  new  EndScreen();
            Greenfoot.setWorld(endScreen);
            Greenfoot.playSound("win.mp3");
        }
    }
}

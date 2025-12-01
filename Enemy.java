import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    protected double health;

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void takeDamage(double amount) {
        health = health - amount;
        int enemyDeathSound = Greenfoot.getRandomNumber(3);

        if (health <= 0) {
            getWorld().removeObject(this);
            
            switch(enemyDeathSound)
            {
                case 0:
                    Greenfoot.playSound("enemy death 1 (edited, trimmed).wav");
                    break;
                case 1:
                    Greenfoot.playSound("enemy death 2 (edited, trimmed).wav");
                    break;
                case 2:
                    Greenfoot.playSound("enemy death 3 (edited, trimmed).wav");
                    break;
            }
        }
    }
}

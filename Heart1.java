import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Heart1 extends PlayerHealth
{
    /**
     * 
     */
    public Heart1(Player player)
    {
        super(player);
    }

    /**
     * Act - do whatever the Heart wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.heartStatus(5.0, 4.0);
    }
}

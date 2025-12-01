import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Heart2 extends PlayerHealth
{
    /**
     * 
     */
    public Heart2(Player player)
    {
        super(player);
    }

    /**
     * Act - do whatever the Heart2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.heartStatus(3.0, 2.0);
    }
}

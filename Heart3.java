import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Heart3 extends PlayerHealth
{
    /**
     * 
     */
    public Heart3(Player player)
    {
        super(player);
    }

    /**
     * Act - do whatever the Heart3 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.heartStatus(1.0, 0.0);
    }
}

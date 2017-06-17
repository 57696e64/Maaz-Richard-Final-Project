import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTwo extends Tank
{
    /**
     * Act - do whatever the PlayerTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (mapChoice == 1) {
            shiftOne();
        }
        else if (mapChoice == 2) {
            shiftTwo();
        }
        
        zoneMovementPTwo();
        
        death(2);
        
        shoot(2);
        coolDownCounter();
        shootingAngle(2);
    }    
}

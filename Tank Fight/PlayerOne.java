import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerOne extends Tank
{
    /**
     * Act - do whatever the PlayerOne wants to do. This method is called whenever
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
        
        zoneMovementPOne();
        
        death(1);
        
        shoot(1);
        coolDownCounter();
        
        shootingAngle(1);
    }    
}

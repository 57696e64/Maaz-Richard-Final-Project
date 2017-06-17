import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletTwo extends Bullet
{
    int initX, initY; // the starting location of the ball
    int time = 0;
    int xSpeed, ySpeed; // these are not current speeds, but initial speeds
    int maxY; // the highest height obtained by the ball as an offset from its starting height

    /**
     * Bullet Constructor: calculates and saves the initial x and y speeds and maximum height of the trajectory
     *
     * @param angle: the initial direction of travel for the ball
     * @param power: the initial speed of the ball in the direction of travel
     */
    public BulletTwo(int angle, int power)
    {
        xSpeed = (int) (power * Math.cos(angle * Math.PI / 180));
        ySpeed = (int) (power * Math.sin(angle * Math.PI / 180)); // also, the amount of time needed to reach the apex of the trajectory
        maxY = ySpeed * (ySpeed + 1) / 2; // verticcal distance to apex determined by the time it takes to get there
        getImage().scale(50, 50);
    }
    
    /**
     * Method addedToWorld: saves the initial location of the ball
     *
     * @param w: unused parameter required by the method
     */
    public void addedToWorld(World w)
    {
        initX = getX();
        initY = getY();
    }

    /**
     * Method act: calculates and sets new location of the ball and removes it upon reaching the right end of the world.
     * The calculation here is done by finding the current vertical distance from the apex of the trajectory.  The difference between
     * the vertical distance to the apex from its starting location (maxY) minus the current vertical distance from the apex is
     * equal to the vertical distance from its starting location.
     */
    public void act()
    {
        time++; // increments time counter
        int newX = initX + xSpeed * time; // calculates the new x-coordinate value
        int timeDif = (int) Math.abs(time - ySpeed); // calculates the time difference to the apex of the trajectory
        int distDif = maxY - timeDif * (timeDif + 1) / 2; // calculates the vertical distance from its starting location
        int newY = initY - distDif; // calculates the new y-coordinate value 
        setLocation(newX, newY);
      //  if (getX() == getWorld().getWidth() - 1) getWorld().removeObject(this);
    }   
}

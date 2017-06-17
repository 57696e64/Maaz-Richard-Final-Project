import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int mapChoice,
        zone;
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void zoneDivide(int mapNumber)
    {
        int x = getX();
        int y = getY();
        
        if (mapNumber == 1) { 
            if (x > 0 && x <= 100) {
                zone = 0;
            }
            else if (x > 100 && x < 200) {
                zone = 1;
            }
            else if (x >= 200 && x < 400) {
                zone = 2;
            }
            else if (x > 800 && x <= 1000) {
                zone = 3;
            }
            else if (x > 1000 && x < 1100) {
                zone = 4;
            }
            else if (x >= 1100 && x < 1200) {
                zone = 5;
            }
            else if (x >= 400 && x < 600) {
                zone = 6;
            }
            else if (x > 600 && x <= 800) {
                zone = 7;
            }   
        }
    }
    
    public void groundHit(int mapNumber) 
    {
        int x = getX();
        int y = getY();

        switch (zone) {
            case 0:
                if (mapNumber == 1) {
                    if (y == 500) {
                        getWorld().removeObject(this);
                    }
                }
                break;
            case 1:
                if (mapNumber == 1) {
                }
                break;
            case 2:
                if (mapNumber == 1) {
                    if (y == 600) {
                        getWorld().removeObject(this);
                    }
                }
                break;
            case 3:
                if (mapNumber == 1) {
                    if (y == 600) {
                        getWorld().removeObject(this);
                    }
                }
                break;
            case 4:
                break;
            case 5:
                if (mapNumber == 1) {
                    if (y == 500) {
                        getWorld().removeObject(this);
                    }
                }
                break;
            case 6:
                if (mapNumber == 1) {
                    if (y >= 150) {
                        getWorld().removeObject(this);
                    }
                }
                break;
            case 7:
                if (mapNumber == 1) {
                    if (y >= 150) {
                        getWorld().removeObject(this);
                    }
                }
                break;
        }
    }
}

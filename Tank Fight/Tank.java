import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Contains all the methods for the tanks.
 * Doesn't do anything on its own.
 * @author Maaz, Richard
 * @version V5.0
 */
public class Tank extends Actor
{
    int zone,
        mapChoice,
        pOneCD = 0,
        pTwoCD = 0,
        cDValue = 75;
    
    /**
     * Act - do whatever the Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
    }
    
    public void mapChoice(int mapNumber)
    {
        mapChoice = mapNumber;
    }
    
    /**
     * This is the method that divides out the zones for map no.1 (Tall Building)
     */
    public void shiftOne() 
    {
        int x = getX();
        int y = getY();
        
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
        else if (x == 400 || x == 1200) {
            zone = 6;
        }
        else if (x == 0 || x == 800) {
            zone = 7;
        }        
    }
    
    /**
     * This is the method that divides out the zones for map no.2 (Temple)
     */
    public void shiftTwo() 
    {
        int x = getX();
        int y = getY();
        
        if (x > 0 && x <= 100) {
            zone = 0;
        }
        else if (x > 100 && x < 400) {
            zone = 1;
        }
        else if (x >= 400 && x <= 800) {
            zone = 2;
        }
        else if (x > 800 && x < 1100) {
            zone = 3;
        }
        else if (x >= 1100 && x < 1200) {
            zone = 4;
        }
        else if (x == 1200) {
            zone = 6;
        }
        else if (x == 0) {
            zone = 7;
        }
    }
    
    /**
     * All the moving patterns for player 1
     */
    public void zoneMovementPOne() 
    {
        int x = getX();
        int y = getY();
        
        switch (zone) {
            case 0:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = 500));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = 500));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                break;
            case 1:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = y - 1));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = y + 1));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = y + 1));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = y - 1));
                    }
                }
                break;
            case 2:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = 300));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = 300));
                    }
                }
                break;
            case 3:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = y - 1));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = y + 1));
                    }
                }
                break;
            case 4:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = y + 1));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = y - 1));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                break;
            case 5:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y = 500));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y = 500));
                    }
                }
                break;
            case 6:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("A")) {
                        setLocation((x - 1), (y));
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                    }
                }                
                break;
            case 7:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("A")) {
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("A")) {
                    }
                    else if (Greenfoot.isKeyDown("D")) {
                        setLocation((x + 1), (y));
                    }
                }           
                break;
            }
    }
    
    /**
     * All the moving patterns for player 2
     */
    public void zoneMovementPTwo() 
    {
        int x = getX();
        int y = getY();
        
        switch (zone) {
            case 0:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = 500));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = 500));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                break;
            case 1:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = y - 1));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = y + 1));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = y + 1));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = y - 1));
                    }
                }
                break;
            case 2:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = 300));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = 300));
                    }
                }
                break;
            case 3:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = y - 1));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = y + 1));
                    }
                }
                break;
            case 4:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = y + 1));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = y - 1));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = 600));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = 600));
                    }
                }
                break;
            case 5:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y = 500));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y = 500));
                    }
                }
                break;
            case 6:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("left")) {
                        setLocation((x - 1), (y));
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                    }
                }
                break;
            case 7:
                if (mapChoice == 1) {
                    if (Greenfoot.isKeyDown("left")) {
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y));
                    }
                }
                else if (mapChoice == 2) {
                    if (Greenfoot.isKeyDown("left")) {
                    }
                    else if (Greenfoot.isKeyDown("right")) {
                        setLocation((x + 1), (y));
                    }
                }
                break;
            }
    }
    
    public void shootingAngle(int playerNumber) 
    {
        if (playerNumber == 1) {
            if (Greenfoot.isKeyDown("W")) {
                turn(-2);
            }
            else if (Greenfoot.isKeyDown("S")) {
                turn(2);
            }
        }
        else if (playerNumber == 2) {
            if (Greenfoot.isKeyDown("up")) {
                turn(-2);
            }
            else if (Greenfoot.isKeyDown("down")) {
                turn(2);
            }
        }
    }
    
    public void shoot(int playerNumber)
    {
        if (playerNumber == 1) {
            if (pOneCD == 0) {
                if (Greenfoot.isKeyDown("space")) {
                    BulletOne bulletOne = new BulletOne((getRotation()*-1), 40);
                    getWorld().addObject(bulletOne, getX(), getY());
                    
                    pOneCD = cDValue;
                }
            }
            
        }
        else if (playerNumber == 2) {
            if (pTwoCD == 0) {
                if (Greenfoot.isKeyDown("0")) {
                    BulletTwo bulletTwo = new BulletTwo((getRotation()), 40);
                    getWorld().addObject(bulletTwo, getX(), getY());
                
                    pTwoCD = cDValue;
                }
            }
        }
    }
    
    public void coolDownCounter()
    {
        if (pOneCD > 0) {
            pOneCD --;
        }
        
        if (pTwoCD > 0) {
            pTwoCD --;
        }
    }
    
    /**
     * Checks if we are hit by a bullet.
     * If yes, then we are dead.
     */
    public void death(int playerNumber)
    {
        Actor bulletOne = getOneIntersectingObject(BulletOne.class);
        Actor bulletTwo = getOneIntersectingObject(BulletTwo.class);
        if (playerNumber == 1) {
            if (bulletTwo != null) {
                getWorld().removeObject(bulletTwo);
                getWorld().removeObject(this);
            }
        }
        else if (playerNumber == 2) {
            if (bulletOne != null) {
                getWorld().removeObject(bulletOne);
                getWorld().removeObject(this);
            }
        }
    }
    
}

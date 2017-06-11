import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * UI element!
 * You can create an UI by insert its name and call its cooresbonding functions
 * No functions just yet
 * @author Richard Guan
 * @version 6/7/2017
 */
public class UI extends Actor
{  
    //The UI's name
    String name;
    
    /**
     * Creates an UI with an inserted name
     */
    public UI(String nameIn) 
    {
        //Sets the name of the UI
        name = nameIn;
        //Calls up the method that can set a image for the UI
        setImage();
    }
    
    /**
     * Act - do whatever the UI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Calls up the method that changes the image of the UI element
        setImage();
        
        //Makes sure that the UI element does not go out of the screen when they are too long
        userFriendly();  
    }    
    
    /**
     * Sets the image of the UI element
     */
    public void setImage()
    {
        //...
    }
    
    /**
     * Makes sure that the UI element does not go out of the screen
     * Note that the code is this method are examples
     */
    public void userFriendly()
    {
        int x = getX();
        int worldWidth = getWorld().getWidth();
        int y = getY();
        int w = (int)getImage().getWidth();
        w = (int)w / 2;
        
        if (name.equals("Kills") || name.equals("Score")) {
            // If it hits the edge of the screen...
            if (x - w - 15 < 0) {
                // Adjust the postion of the UI, line to the left
                setLocation((0 + w + 15), y);
            }
        }
        else if (name.equals("Lv")) {
            // If it hits the edge of the screen...
            if (x + w + 15 > worldWidth) {
                // Adjust the postion of the UI, line to the left
                setLocation((worldWidth - w - 15), y);
            }
        }
    }
    
    /**
     * Resets the UI element when the game is ready to reset
     */
    public void reset()
    {
        //...
    }
}

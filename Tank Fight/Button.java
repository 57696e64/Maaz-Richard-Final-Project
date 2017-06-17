import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Performs some actions when it is clicked.
 * @author Richard Guan
 * @version 6/11/2017
 */
public class Button extends Actor
{
    //Declares the global variables
    boolean buttonState = false; //The button is off
    String buttonText;
    
    /**
     * Gets the button's name.
     */
    public Button(String name) 
    {
        buttonText = name;
        //Calls up the method to perform actions
        buttonOff();
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever.
     * the 'Act' or 'Run' button gets pressed in the environment..
     */
    public void act() 
    {
        //Does nothing on its own
    }    
    
    /**
     * When the button is off, text color is CYAN and back ground color is BLACK.
     * Uses its name as its picture.
     */
    public void buttonOff() 
    {
        GreenfootImage buttonImage = new GreenfootImage(buttonText, 45, Color.CYAN, Color.BLACK);
        setImage(buttonImage);
        buttonState = false;
    }
    
    /**
     * When the button is on, do different actions accourding to its name.
     * This is an empty method.
     */
    public void buttonOn()
    {
        //The button is on
        buttonState = true;
        
        MyWorld myWorld = (MyWorld) getWorld();
        
        if (buttonText.equals("Tall Building")) {
            myWorld.tallBuilding();
        }
        else if (buttonText.equals("Temple")) {
            myWorld.temple();
        }
        //Removes all the buttons from the world no matter which one is clicked
        getWorld().removeObjects(getWorld().getObjects(Button.class));
    }
    
    /**
     * This method countrols the button's state (ON or OFF).
     */
    public void buttonToggle() 
    {
        if (buttonState) {
            buttonOff();
        }
        else {
            buttonOn();
        }
    }    
}
